package cy3;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.gif.MMAnimateView f224850a;

    /* renamed from: b, reason: collision with root package name */
    public int f224851b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f224852c;

    /* renamed from: d, reason: collision with root package name */
    public vx3.i f224853d;

    public u(com.tencent.mm.plugin.gif.MMAnimateView iconIv) {
        kotlin.jvm.internal.o.g(iconIv, "iconIv");
        this.f224850a = iconIv;
        this.f224851b = com.tencent.mm.R.raw.icons_filled_ringing;
        android.content.Context context = iconIv.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f224852c = context;
    }

    public final void a(boolean z17) {
        int i17 = this.f224851b;
        android.content.Context context = this.f224852c;
        this.f224850a.setImageDrawable(com.tencent.mm.ui.uk.e(context, i17, context.getResources().getColor(z17 ? com.tencent.mm.R.color.FG_0 : com.tencent.mm.R.color.FG_4)));
    }
}
