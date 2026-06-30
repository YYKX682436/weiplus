package ty2;

/* loaded from: classes9.dex */
public final class y extends com.tencent.mm.plugin.finder.feed.RoundLinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f423122m = 0;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f423123g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f423124h;

    /* renamed from: i, reason: collision with root package name */
    public ty2.v f423125i;

    public y(android.content.Context context, yz5.l lVar, kotlin.jvm.internal.i iVar) {
        super(context);
        this.f423123g = lVar;
        this.f423124h = jz5.h.b(new ty2.x(this, context));
        this.f423125i = new ty2.v(0, null);
        setOrientation(1);
    }

    private final boolean getEnableUpdate() {
        ty2.v vVar = this.f423125i;
        return vVar.f423118b != null && vVar.f423117a > 0;
    }

    private final java.util.List<ty2.b> getSubViews() {
        return (java.util.List) ((jz5.n) this.f423124h).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewStatus(ty2.v vVar) {
        if (kotlin.jvm.internal.o.b(this.f423125i, vVar)) {
            return;
        }
        this.f423125i = vVar;
        if (getEnableUpdate()) {
            removeAllViews();
            if (getEnableUpdate()) {
                for (ty2.b bVar : getSubViews()) {
                    bVar.f423060c = ty2.z.a(bVar.f423060c, 0, 0, 0, 0, (this.f423125i.f423117a - c(bVar.f423060c.f423127b)) - c(bVar.f423060c.f423128c), null, 47, null);
                    bw5.q5 q5Var = this.f423125i.f423118b;
                    if (q5Var == null) {
                        return;
                    }
                    android.view.View b17 = bVar.b(q5Var);
                    if (b17 != null) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams.setMargins(c(bVar.f423060c.f423127b), c(bVar.f423060c.f423126a), c(bVar.f423060c.f423128c), c(bVar.f423060c.f423129d));
                        addView(b17, marginLayoutParams);
                    }
                }
            }
        }
    }

    public final int c(int i17) {
        return i65.a.b(getContext(), i17);
    }

    public final void d(bw5.q5 item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f423125i.getClass();
        setViewStatus(new ty2.v(i17, item));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        post(new ty2.w(this));
    }
}
