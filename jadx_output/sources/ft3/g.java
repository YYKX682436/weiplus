package ft3;

/* loaded from: classes12.dex */
public final class g implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.r0 f266549a;

    /* renamed from: b, reason: collision with root package name */
    public final ft3.a f266550b = new ft3.a();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f266551c = jz5.h.b(ft3.d.f266546d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f266552d = jz5.h.b(ft3.e.f266547d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f266553e = jz5.h.b(new ft3.f(this));

    /* renamed from: f, reason: collision with root package name */
    public ft3.i f266554f;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f266549a == null) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.duv, (android.view.ViewGroup) null);
            em.r0 r0Var = new em.r0(inflate);
            this.f266549a = r0Var;
            androidx.recyclerview.widget.RecyclerView a17 = r0Var.a();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext());
            linearLayoutManager.Q(0);
            a17.setLayoutManager(linearLayoutManager);
            a17.N(new ft3.c(r0Var));
            a17.setAdapter(this.f266550b);
        }
        em.r0 r0Var2 = this.f266549a;
        kotlin.jvm.internal.o.d(r0Var2);
        android.view.View view = r0Var2.f254742a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        ft3.i iVar = (ft3.i) pVar;
        this.f266554f = iVar;
        em.r0 r0Var = this.f266549a;
        if (r0Var != null) {
            if (r0Var.f254746e == null) {
                r0Var.f254746e = (androidx.constraintlayout.widget.ConstraintLayout) r0Var.f254742a.findViewById(com.tencent.mm.R.id.f483738i34);
            }
            constraintLayout = r0Var.f254746e;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(iVar != null ? iVar.f266567f : null);
            ((android.graphics.drawable.GradientDrawable) ((jz5.n) this.f266551c).getValue()).setColor(iVar != null ? iVar.f266568g : 0);
            ((android.graphics.drawable.GradientDrawable) ((jz5.n) this.f266552d).getValue()).setColor(iVar != null ? iVar.f266569h : 0);
            constraintLayout.setBackground((android.graphics.drawable.StateListDrawable) ((jz5.n) this.f266553e).getValue());
        }
        em.r0 r0Var2 = this.f266549a;
        if (r0Var2 != null) {
            if (r0Var2.f254743b == null) {
                r0Var2.f254743b = (android.widget.TextView) r0Var2.f254742a.findViewById(com.tencent.mm.R.id.okp);
            }
            textView = r0Var2.f254743b;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setMinWidth(iVar != null ? iVar.f266565d : 0);
            textView.setMaxWidth(iVar != null ? iVar.f266566e : Integer.MAX_VALUE);
            textView.setText(iVar != null ? iVar.f266570i : null);
            textView.setMaxLines(iVar != null ? iVar.f266571m : 0);
            textView.setVisibility(iVar != null ? iVar.f266572n : 0);
        }
        em.r0 r0Var3 = this.f266549a;
        if (r0Var3 != null) {
            if (r0Var3.f254745d == null) {
                r0Var3.f254745d = (android.widget.TextView) r0Var3.f254742a.findViewById(com.tencent.mm.R.id.s99);
            }
            textView2 = r0Var3.f254745d;
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            textView2.setMinWidth(iVar != null ? iVar.f266565d : 0);
            textView2.setMaxWidth(iVar != null ? iVar.f266566e : Integer.MAX_VALUE);
            textView2.setText(iVar != null ? iVar.f266573o : null);
            textView2.setMaxLines(iVar != null ? iVar.f266574p : 0);
            textView2.setVisibility(iVar != null ? iVar.f266575q : 8);
        }
        em.r0 r0Var4 = this.f266549a;
        androidx.recyclerview.widget.RecyclerView a17 = r0Var4 != null ? r0Var4.a() : null;
        if (a17 != null) {
            a17.setVisibility(iVar != null ? iVar.f266577s : 8);
            java.util.List list = iVar != null ? iVar.f266576r : null;
            ft3.a aVar = this.f266550b;
            aVar.f266542d = list;
            aVar.notifyDataSetChanged();
        }
        em.r0 r0Var5 = this.f266549a;
        if (r0Var5 != null) {
            if (r0Var5.f254747f == null) {
                r0Var5.f254747f = (android.widget.TextView) r0Var5.f254742a.findViewById(com.tencent.mm.R.id.s9a);
            }
            textView3 = r0Var5.f254747f;
        } else {
            textView3 = null;
        }
        if (textView3 == null) {
            return;
        }
        textView3.setText(iVar != null ? iVar.f266578t : null);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f266554f;
    }
}
