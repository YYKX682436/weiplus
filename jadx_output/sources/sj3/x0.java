package sj3;

/* loaded from: classes11.dex */
public final class x0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f408794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408796f;

    public x0(kotlin.jvm.internal.h0 h0Var, android.view.View view, sj3.a1 a1Var) {
        this.f408794d = h0Var;
        this.f408795e = view;
        this.f408796f = a1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        java.lang.Iterable<cv.v0> iterable = (java.lang.Iterable) this.f408794d.f310123d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        for (cv.v0 v0Var : iterable) {
            android.view.MenuItem add = contextMenu.add(0, v0Var.f222516a, 0, v0Var.f222517b);
            android.content.Context context = this.f408795e.getContext();
            this.f408796f.getClass();
            int i17 = v0Var.f222516a;
            add.setIcon(com.tencent.mm.ui.uk.e(context, i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.tencent.mm.R.raw.icons_filled_multiple_volume : com.tencent.mm.R.raw.icons_filled_bluetooth : com.tencent.mm.R.raw.icons_outlined_earphone : com.tencent.mm.R.raw.icons_filled_ear : com.tencent.mm.R.raw.icon_filled_speaker, -1));
            arrayList.add(jz5.f0.f302826a);
        }
    }
}
