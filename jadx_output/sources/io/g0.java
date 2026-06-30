package io;

/* loaded from: classes10.dex */
public final class g0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public xb5.b f293403a;

    /* renamed from: b, reason: collision with root package name */
    public em.h1 f293404b;

    /* renamed from: c, reason: collision with root package name */
    public final io.f0 f293405c = new io.f0();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f293406d;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        com.tencent.mm.view.recyclerview.WxRecyclerView a17;
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f293404b == null) {
            android.content.Context context2 = null;
            em.h1 h1Var = new em.h1(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.duy, (android.view.ViewGroup) null));
            this.f293404b = h1Var;
            com.tencent.mm.view.recyclerview.WxRecyclerView a18 = h1Var.a();
            if (a18 != null) {
                a18.setItemAnimator(new androidx.recyclerview.widget.z());
                em.h1 h1Var2 = this.f293404b;
                if (h1Var2 != null && (a17 = h1Var2.a()) != null) {
                    context2 = a17.getContext();
                }
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context2);
                linearLayoutManager.Q(1);
                a18.setLayoutManager(linearLayoutManager);
                a18.setAdapter(this.f293405c);
            }
        }
        em.h1 h1Var3 = this.f293404b;
        kotlin.jvm.internal.o.d(h1Var3);
        android.view.View view = h1Var3.f254379a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(xb5.b bVar) {
        com.tencent.mm.view.recyclerview.WxRecyclerView a17;
        this.f293403a = bVar;
        if (bVar == null) {
            return;
        }
        java.util.List list = this.f293406d;
        if (list != null) {
            list.isEmpty();
        }
        java.util.List<xb5.a> list2 = bVar.f453011d;
        io.f0 f0Var = this.f293405c;
        f0Var.f293181d = list2;
        if (list2 != null) {
            for (xb5.a aVar : list2) {
                aVar.f453009g = bVar.f453012e;
                aVar.f453010h = bVar.f453013f;
            }
        }
        em.h1 h1Var = this.f293404b;
        if (h1Var != null && (a17 = h1Var.a()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/chatting/viewfactory/ContactListView", "updateViewModel", "(Lcom/tencent/mm/ui/chatting/contact/ContactListViewModel;)V", "Undefined", "scrollToPosition", "(I)V");
            a17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/chatting/viewfactory/ContactListView", "updateViewModel", "(Lcom/tencent/mm/ui/chatting/contact/ContactListViewModel;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        f0Var.notifyDataSetChanged();
        this.f293406d = bVar.f453011d;
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293403a;
    }
}
