package w91;

/* loaded from: classes13.dex */
public class b extends w91.f {
    public b(java.lang.String str, java.lang.String str2) {
        super(str, str2);
        c("SOAPACTION", "\"" + str2 + "#" + this.f444064b + "\"");
        d();
    }

    @Override // w91.d
    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><s:Envelope s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\"><s:Body>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<u:");
        java.lang.String str = this.f444064b;
        sb7.append(str);
        sb7.append(" xmlns:u=\"");
        sb7.append(this.f444066d);
        sb7.append("\">\n<InstanceID>0</InstanceID>\n</u:");
        sb7.append(str);
        sb7.append(">\n");
        sb6.append(sb7.toString());
        sb6.append("</s:Body></s:Envelope>");
        return sb6.toString();
    }

    @Override // w91.f
    public java.lang.String b() {
        return "GetPositionInfo";
    }
}
