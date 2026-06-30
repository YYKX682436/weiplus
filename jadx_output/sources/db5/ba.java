package db5;

/* loaded from: classes13.dex */
public final class ba {

    /* renamed from: b, reason: collision with root package name */
    public boolean f228300b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f228299a = true;

    /* renamed from: c, reason: collision with root package name */
    public db5.aa f228301c = db5.aa.f228283d;

    public ba(kotlin.jvm.internal.i iVar) {
    }

    public final android.graphics.drawable.Drawable a() {
        int f17;
        int ordinal = this.f228301c.ordinal();
        if (ordinal == 0) {
            f17 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479704cz);
        } else if (ordinal == 1) {
            f17 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479693cs);
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            f17 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9);
        }
        boolean z17 = this.f228299a;
        android.graphics.drawable.Drawable e17 = m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), (!z17 || this.f228300b) ? (z17 && this.f228300b) ? this.f228301c == db5.aa.f228285f ? com.tencent.mm.R.raw.checkbox_mini_select_overlay_regular : com.tencent.mm.R.raw.checkbox_select_overlay_regular : this.f228301c == db5.aa.f228285f ? com.tencent.mm.R.raw.checkbox_mini_unselect_regular : com.tencent.mm.R.raw.checkbox_unselect_regular : this.f228301c == db5.aa.f228285f ? com.tencent.mm.R.raw.checkbox_mini_select_filled : com.tencent.mm.R.raw.checkbox_select_filled, (f17 * 1.0f) / com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(r1).getIntrinsicWidth());
        boolean z18 = this.f228299a;
        java.lang.Integer valueOf = (z18 && this.f228300b) ? java.lang.Integer.valueOf(com.tencent.mm.R.color.age) : (z18 || this.f228300b) ? (z18 || !this.f228300b) ? null : java.lang.Integer.valueOf(com.tencent.mm.R.color.agf) : java.lang.Integer.valueOf(com.tencent.mm.R.color.agd);
        if (valueOf != null) {
            com.tencent.mm.ui.uk.f(e17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(valueOf.intValue()));
        }
        return e17;
    }
}
