package rx4;

/* loaded from: classes8.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f401115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.i f401116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f401118g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401119h;

    public c0(rx4.e0 e0Var, rx4.i iVar, int i17, android.view.ViewGroup viewGroup, java.lang.String str) {
        this.f401115d = e0Var;
        this.f401116e = iVar;
        this.f401117f = i17;
        this.f401118g = viewGroup;
        this.f401119h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.e0 e0Var = this.f401115d;
        boolean z17 = e0Var.f401139f;
        int i17 = this.f401117f;
        rx4.i iVar = this.f401116e;
        if (z17) {
            e0Var.W6(vu4.a.f440253w, iVar, java.lang.Integer.valueOf(i17));
            e0Var.U6(iVar, i17);
            rx4.e0.Y6(e0Var, false, 1, null);
        } else {
            e0Var.hideVKB();
            e0Var.W6(vu4.a.f440243m, iVar, java.lang.Integer.valueOf(i17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] historyItem click, index=");
            sb6.append(i17);
            sb6.append(", hasSearchId=");
            sb6.append(iVar.f401190f.length() > 0);
            sb6.append(", isLive=");
            sb6.append(iVar.f401191g);
            com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
            boolean z18 = iVar.f401190f.length() == 0;
            android.view.ViewGroup viewGroup = this.f401118g;
            if (z18) {
                com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", "[hitest] searchId empty, fallback searchQuery without searchId");
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                rx4.h2.u7((rx4.h2) a17, 65, this.f401119h, iVar.f401187c, null, null, 24, null);
            } else {
                com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", "[hitest] searchQuery with searchId");
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(rx4.h2.class);
                kotlin.jvm.internal.o.f(a18, "get(...)");
                rx4.h2.u7((rx4.h2) a18, 65, this.f401119h, iVar.f401190f, iVar.f401187c, null, 16, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
