package vw3;

/* loaded from: classes.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f440904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f440905f;

    public c0(java.lang.String str, com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.a3 a3Var) {
        this.f440903d = str;
        this.f440904e = z3Var;
        this.f440905f = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n                username:");
        java.lang.String str = this.f440903d;
        sb6.append(str);
        sb6.append("\n                nickname:");
        com.tencent.mm.storage.z3 z3Var = this.f440904e;
        sb6.append(z3Var.P0());
        sb6.append("\n                remark:");
        sb6.append(z3Var.f236589y1);
        sb6.append("\n                type:");
        sb6.append(java.lang.Integer.toBinaryString(z3Var.getType()));
        sb6.append("\n                memberCount:");
        com.tencent.mm.storage.a3 a3Var = this.f440905f;
        sb6.append(a3Var.field_memberCount);
        sb6.append("\n                memberStatus:");
        sb6.append(java.lang.Integer.toBinaryString(a3Var.field_chatroomStatus));
        sb6.append("\n                memberFlag:");
        sb6.append(java.lang.Integer.toBinaryString(a3Var.field_chatroomdataflag));
        sb6.append("\n                memberList:");
        sb6.append(a3Var.field_memberlist);
        sb6.append("\n            ");
        java.lang.String b17 = r26.b0.b(sb6.toString());
        java.lang.String format = java.lang.String.format("chatroom_info_%s_%s.txt", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Long.valueOf(c01.id.c())}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
        byte[] bytes = b17.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        ((zc0.h) i1Var).aj(format, bytes, true);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
