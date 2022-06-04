package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String ap_paterno;
    private String ap_materno;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getap_paterno() {
        return ap_paterno;
    }

    public void setap_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    @ColumnName("apellido_materno")
    public String getap_materno() {
        return ap_materno;
    }

    public void setap_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    @ColumnName("RFC")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
