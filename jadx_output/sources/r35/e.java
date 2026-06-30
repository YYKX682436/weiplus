package r35;

/* loaded from: classes5.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.i3 f369074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f369075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f369076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f369078h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.my6 f369079i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r35.a f369080m;

    public e(r35.a aVar, db5.i3 i3Var, int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, r45.my6 my6Var) {
        this.f369080m = aVar;
        this.f369074d = i3Var;
        this.f369075e = i17;
        this.f369076f = i18;
        this.f369077g = str;
        this.f369078h = m1Var;
        this.f369079i = my6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/AddContact$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f369074d.B();
        this.f369080m.j(this.f369075e, this.f369076f, this.f369077g, this.f369078h, this.f369079i.f380933g);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/AddContact$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
