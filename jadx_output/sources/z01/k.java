package z01;

/* loaded from: classes9.dex */
public class k extends e14.k implements q31.p {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnClickListener f469083d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnLongClickListener f469084e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnTouchListener f469085f;

    /* renamed from: g, reason: collision with root package name */
    public final int f469086g;

    public k() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "emojiGravity"), com.tencent.mm.protobuf.i.u(-1, "emojiMd5"), com.tencent.mm.protobuf.i.n(-1, "emojiCacheKey"), com.tencent.mm.protobuf.i.c(-1, "isPlayed"), com.tencent.mm.protobuf.i.u(-1, "String"), com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.u(-1, "appname")});
        this.f469086g = appendAttrs;
        super.set__serialName("emojiViewModel");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", 0L, java.lang.Boolean.FALSE, "", "", ""});
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String getAppId() {
        return super.getString(this.f469086g + 5);
    }

    public java.lang.String getAppName() {
        return super.getString(this.f469086g + 6);
    }

    public java.lang.String getEmojiMd5() {
        return super.getString(this.f469086g + 1);
    }

    public long j() {
        return super.getLong(this.f469086g + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f469086g + 4);
    }

    public int l() {
        return super.getInteger(this.f469086g + 0);
    }

    public boolean n() {
        return super.getBoolean(this.f469086g + 3);
    }

    public void o(java.lang.String str) {
        super.set(this.f469086g + 5, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f469086g + 6, str);
    }

    public void q(long j17) {
        super.set(this.f469086g + 2, java.lang.Long.valueOf(j17));
    }

    public void r(java.lang.String str) {
        super.set(this.f469086g + 4, str);
    }

    public void s(int i17) {
        super.set(this.f469086g + 0, java.lang.Integer.valueOf(i17));
    }

    public void t(java.lang.String str) {
        super.set(this.f469086g + 1, str);
    }

    public void u(boolean z17) {
        super.set(this.f469086g + 3, java.lang.Boolean.valueOf(z17));
    }
}
