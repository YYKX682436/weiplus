package i33;

/* loaded from: classes10.dex */
public final class e1 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288180f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288181g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f288182h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f288183i;

    /* renamed from: m, reason: collision with root package name */
    public j33.m f288184m;

    /* renamed from: n, reason: collision with root package name */
    public final long f288185n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288180f = "MicroMsg.AlbumTimeHeaderUIC";
        this.f288182h = jz5.h.b(new i33.c1(this));
        this.f288183i = jz5.h.b(new i33.d1(this));
        this.f288185n = 150L;
    }

    @Override // i33.c
    public void V6(com.tencent.mm.ui.q2 oldMode, com.tencent.mm.ui.q2 newMode) {
        kotlin.jvm.internal.o.g(oldMode, "oldMode");
        kotlin.jvm.internal.o.g(newMode, "newMode");
        java.lang.String str = this.f288180f;
        com.tencent.mars.xlog.Log.i(str, "onSelectModeChanged: oldMode=" + oldMode + ", newMode=" + newMode);
        if (oldMode == newMode) {
            return;
        }
        if (newMode != com.tencent.mm.ui.q2.NORMAL) {
            this.f288181g = true;
            androidx.recyclerview.widget.f2 adapter = T6().getAdapter();
            X6(adapter instanceof e33.b0 ? (e33.b0) adapter : null);
            return;
        }
        this.f288181g = false;
        if (W6().getVisibility() == 0) {
            j33.m mVar = new j33.m(W6(), false, this.f288185n, null, 8, null);
            this.f288184m = mVar;
            mVar.run();
            this.f288184m = null;
            com.tencent.mars.xlog.Log.i(str, "hideNewTimeHeader: ");
        }
    }

    public final android.view.View W6() {
        java.lang.Object value = ((jz5.n) this.f288182h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void X6(e33.b0 b0Var) {
        java.lang.String str;
        if (this.f288181g) {
            if (W6().getVisibility() != 0) {
                if (this.f288184m == null) {
                    j33.m mVar = new j33.m(W6(), true, this.f288185n, null, 8, null);
                    this.f288184m = mVar;
                    mVar.run();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showNewTimeHeader: visible=");
                sb6.append(W6().getVisibility() == 0);
                sb6.append(", alpha=");
                sb6.append(W6().getAlpha());
                com.tencent.mars.xlog.Log.i(this.f288180f, sb6.toString());
            }
            if (b0Var != null) {
                int w17 = U6().w();
                java.util.LinkedList linkedList = b0Var.f247139r;
                if (w17 < linkedList.size()) {
                    w17 = linkedList.size();
                }
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = b0Var.E(w17);
                if (E == null) {
                    str = "";
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(E.f138441s)) {
                    java.util.Date date = new java.util.Date(E.f138435m);
                    com.tencent.mm.ui.gridviewheaders.a.e().getClass();
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.setTime(date);
                    str = b0Var.f247129e.getString(com.tencent.mm.R.string.bnd, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)));
                } else {
                    str = E.f138441s;
                }
            } else {
                str = null;
            }
            java.lang.String str2 = str != null ? str : "";
            java.lang.Object value = ((jz5.n) this.f288183i).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.widget.TextView) value).setText(str2);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f353948a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            i33.z0.Y6(z0Var, this, 0, 2, null);
        }
    }
}
