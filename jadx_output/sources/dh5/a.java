package dh5;

/* loaded from: classes8.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public android.os.Bundle f232618d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Class f232619e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f232620f;

    /* renamed from: g, reason: collision with root package name */
    public bh5.k f232621g;

    /* renamed from: h, reason: collision with root package name */
    public final int f232622h;

    public a() {
        com.tencent.mm.protobuf.k u17 = com.tencent.mm.protobuf.i.u(-1, "activityClassName");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.c(-1, "enablePullDownClose"), u17, com.tencent.mm.protobuf.i.c(-1, "navigationBarTransparent"), com.tencent.mm.protobuf.i.c(-1, "isUseTransparentActivity"), com.tencent.mm.protobuf.i.c(-1, "fullScreen"), com.tencent.mm.protobuf.i.c(-1, "smoothAnim"), com.tencent.mm.protobuf.i.i(-1, "requestCode"), com.tencent.mm.protobuf.i.i(-1, "forceOrientation"), com.tencent.mm.protobuf.i.c(-1, "isRecordDragPosition")});
        this.f232622h = appendAttrs;
        super.set__serialName("HalfScreenStartParam");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        this.f232619e = com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment.class;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        super.replaceDefault(appendAttrs, new java.lang.Object[]{bool, "", bool2, bool, bool2, bool2, -1, -1, bool2});
    }

    public void A(boolean z17) {
        super.set(this.f232622h + 5, java.lang.Boolean.valueOf(z17));
    }

    public void B(boolean z17) {
        super.set(this.f232622h + 3, java.lang.Boolean.valueOf(z17));
    }

    public java.lang.String j() {
        return super.getString(this.f232622h + 1);
    }

    public boolean k() {
        return super.getBoolean(this.f232622h + 0);
    }

    public int l() {
        return super.getInteger(this.f232622h + 7);
    }

    public boolean n() {
        return super.getBoolean(this.f232622h + 4);
    }

    public boolean o() {
        return super.getBoolean(this.f232622h + 2);
    }

    public int p() {
        return super.getInteger(this.f232622h + 6);
    }

    public boolean q() {
        return super.getBoolean(this.f232622h + 5);
    }

    public boolean r() {
        return super.getBoolean(this.f232622h + 8);
    }

    public boolean s() {
        return super.getBoolean(this.f232622h + 3);
    }

    public void t(java.lang.String str) {
        super.set(this.f232622h + 1, str);
    }

    public void u(boolean z17) {
        super.set(this.f232622h + 0, java.lang.Boolean.valueOf(z17));
    }

    public void w(int i17) {
        super.set(this.f232622h + 7, java.lang.Integer.valueOf(i17));
    }

    public void x(boolean z17) {
        super.set(this.f232622h + 4, java.lang.Boolean.valueOf(z17));
    }

    public void y(boolean z17) {
        super.set(this.f232622h + 2, java.lang.Boolean.valueOf(z17));
    }

    public void z(int i17) {
        super.set(this.f232622h + 6, java.lang.Integer.valueOf(i17));
    }
}
