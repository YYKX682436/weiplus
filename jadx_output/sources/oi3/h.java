package oi3;

/* loaded from: classes12.dex */
public class h extends oi3.g {

    /* renamed from: e, reason: collision with root package name */
    public final int f345618e;

    public h() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "imgPath")});
        this.f345618e = appendAttrs;
        super.set__serialName("simplevideoinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{""});
    }

    public java.lang.String j() {
        return super.getString(this.f345618e + 0);
    }

    public final boolean k() {
        int i17 = this.f345617d;
        return (getString(i17 + 3).length() > 0) && getLong(i17 + 0) > 0;
    }

    public void l(java.lang.String str) {
        super.set(this.f345618e + 0, str);
    }
}
