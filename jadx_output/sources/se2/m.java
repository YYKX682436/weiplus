package se2;

/* loaded from: classes3.dex */
public final class m implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm2.c f406862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f406863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406864c;

    public m(lm2.c cVar, android.content.Context context, java.lang.String str) {
        this.f406862a = cVar;
        this.f406863b = context;
        this.f406864c = str;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.view.MenuItem findItem = g4Var.findItem(165);
        lm2.c cVar = this.f406862a;
        android.content.Context context = this.f406863b;
        if (findItem != null) {
            com.tencent.mars.xlog.Log.e(this.f406864c, "msg " + cVar.h() + " seq:" + cVar.e());
        } else if (cVar.f319374g) {
            g4Var.i(166, context.getString(com.tencent.mm.R.string.f491251ci5), context.getResources().getColor(com.tencent.mm.R.color.f479048oc), com.tencent.mm.R.raw.icons_filled_call_good, context.getResources().getColor(com.tencent.mm.R.color.f479048oc));
        } else {
            g4Var.i(165, context.getString(com.tencent.mm.R.string.ci6), context.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_call_good, context.getResources().getColor(com.tencent.mm.R.color.a18));
        }
        se2.w wVar = se2.w.f406895a;
        if (se2.w.a(wVar, context, cVar) && g4Var.findItem(154) == null) {
            g4Var.i(154, context.getString(com.tencent.mm.R.string.f491470d61), context.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_reply, context.getResources().getColor(com.tencent.mm.R.color.a18));
        }
        if (g4Var.findItem(155) == null) {
            g4Var.i(155, context.getString(com.tencent.mm.R.string.f491683dx2), context.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_copy, context.getResources().getColor(com.tencent.mm.R.color.a18));
        }
        if (se2.w.a(wVar, context, cVar)) {
            se2.e eVar = se2.e.f406847a;
            if (se2.e.f406849c.contains(java.lang.Integer.valueOf(cVar.h())) && g4Var.findItem(156) == null) {
                g4Var.i(156, context.getString(com.tencent.mm.R.string.f491699dy4), context.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.icons_filled_report_problem, context.getResources().getColor(com.tencent.mm.R.color.a18));
            }
        }
    }
}
