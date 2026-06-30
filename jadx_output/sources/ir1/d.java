package ir1;

/* loaded from: classes3.dex */
public final class d extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f293949d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f293950e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f293951f;

    public d(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f293949d = context;
        this.f293950e = new java.util.ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f293950e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.lang.Object obj = this.f293950e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (r45.d04) obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.app.Activity activity = this.f293949d;
        if (view == null) {
            view = android.view.View.inflate(activity, com.tencent.mm.R.layout.dzg, null);
            view.setTag(new ir1.a());
        }
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.conversation.ui.BizFansBlackListAdapter.ContactViewHolder");
        ir1.a aVar = (ir1.a) tag;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        aVar.f293928a = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.kbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        aVar.f293929b = (android.widget.TextView) findViewById2;
        java.lang.Object obj = this.f293950e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.d04 d04Var = (r45.d04) obj;
        if (d04Var.f371979d.f372892f == 1) {
            n11.a b17 = n11.a.b();
            java.lang.String str = d04Var.f371979d.f372890d;
            android.widget.ImageView imageView = aVar.f293928a;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            o11.f fVar = new o11.f();
            fVar.f342096t = true;
            b17.h(str, imageView, fVar.a());
        } else {
            n11.a b18 = n11.a.b();
            java.lang.String str2 = d04Var.f371979d.f372890d;
            android.widget.ImageView imageView2 = aVar.f293928a;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            o11.f fVar2 = new o11.f();
            fVar2.f342096t = false;
            b18.h(str2, imageView2, fVar2.a());
        }
        android.widget.TextView textView = aVar.f293929b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nicknameTv");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str3 = d04Var.f371979d.f372891e;
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, str3));
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f484307ds5);
        findViewById3.setOnLongClickListener(new ir1.b(this, findViewById3, i17));
        findViewById3.setOnClickListener(new ir1.c(this, findViewById3, i17));
        return view;
    }
}
