package i12;

/* loaded from: classes12.dex */
public class k extends android.widget.ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final int f287220d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f287221e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.model.e0 f287222f;

    public k(android.content.Context context, com.tencent.mm.plugin.emoji.model.e0 e0Var) {
        super(context, com.tencent.mm.R.layout.a7h, e0Var.c());
        this.f287220d = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480362vt);
        this.f287221e = context;
        this.f287222f = e0Var;
        java.util.Iterator it = e0Var.c().iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiSortAdapter", "before sort %s", ((m22.i) it.next()).b());
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        i12.j jVar;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(this.f287221e).inflate(com.tencent.mm.R.layout.a7h, (android.view.ViewGroup) null);
            jVar = new i12.j(this, view);
            view.setTag(jVar);
        } else {
            jVar = (i12.j) view.getTag();
        }
        m22.p pVar = (m22.p) getItem(i17);
        if (n22.l.b(pVar.b())) {
            jVar.f287218c.setText(com.tencent.mm.R.string.f491115c00);
        } else {
            jVar.f287218c.setText(pVar.c());
        }
        if (n22.l.b(pVar.b())) {
            jVar.f287217b.setImageResource(com.tencent.mm.R.drawable.icon_002_cover);
        } else {
            vo0.e eVar = vo0.e.f438467a;
            wo0.c a17 = vo0.e.f438468b.a(pVar.a());
            yo0.f fVar = new yo0.f();
            fVar.f464078b = true;
            a17.f447872c = fVar.a();
            ((wo0.b) a17).c(jVar.f287217b);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiSortAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiSortAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }
}
