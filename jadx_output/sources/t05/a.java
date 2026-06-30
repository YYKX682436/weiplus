package t05;

/* loaded from: classes12.dex */
public class a extends r05.k {

    /* renamed from: e, reason: collision with root package name */
    public final int f414527e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "appattach", r05.j.class), com.tencent.mm.protobuf.i.u(-1, "recorditem"), com.tencent.mm.protobuf.i.u(-1, "announcement"), com.tencent.mm.protobuf.i.u(-1, "textannouncement")});
        this.f414527e = appendAttrs;
        super.set__serialName("appmsg");
        super.set__xmlPrefixTag("msg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, "", "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f414527e + 2);
    }

    public r05.j k() {
        return (r05.j) super.getCustom(this.f414527e + 0);
    }

    public java.lang.String l() {
        return super.getString(this.f414527e + 1);
    }

    public java.lang.String n() {
        return super.getString(this.f414527e + 3);
    }
}
