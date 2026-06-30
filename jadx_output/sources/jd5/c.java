package jd5;

/* loaded from: classes9.dex */
public class c extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f299185e;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "thumbWidth"), com.tencent.mm.protobuf.i.i(-1, "thumbHeight"), com.tencent.mm.protobuf.i.u(-1, "thumbPath"), com.tencent.mm.protobuf.i.u(-1, "videoPath"), com.tencent.mm.protobuf.i.i(-1, "videoDuration"), com.tencent.mm.protobuf.i.c(-1, "forceCompressedVideo")});
        this.f299185e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, "", "", 0, java.lang.Boolean.FALSE});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String getThumbPath() {
        return super.getString(this.f299185e + 2);
    }

    public int getVideoDuration() {
        return super.getInteger(this.f299185e + 4);
    }

    public boolean j() {
        return super.getBoolean(this.f299185e + 5);
    }

    public java.lang.String k() {
        return super.getString(this.f299185e + 3);
    }

    public void l(boolean z17) {
        super.set(this.f299185e + 5, java.lang.Boolean.valueOf(z17));
    }

    public void n(int i17) {
        super.set(this.f299185e + 1, java.lang.Integer.valueOf(i17));
    }

    public void o(java.lang.String str) {
        super.set(this.f299185e + 2, str);
    }

    public void p(int i17) {
        super.set(this.f299185e + 0, java.lang.Integer.valueOf(i17));
    }

    public void q(int i17) {
        super.set(this.f299185e + 4, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f299185e + 3, str);
    }
}
