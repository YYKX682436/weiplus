package fk2;

/* loaded from: classes3.dex */
public final class b extends fk2.f3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // fk2.f3, we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str;
        java.lang.String string3;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object D = msg.D();
        r45.jh1 jh1Var = D instanceof r45.jh1 ? (r45.jh1) D : null;
        if (jh1Var != null) {
            android.content.Context context2 = holder.itemView.getContext();
            int integer = jh1Var.getInteger(0);
            java.lang.String str2 = "";
            if (integer == 1) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                r45.f62 f62Var = (r45.f62) jh1Var.getCustom(1);
                if (f62Var != null && (string2 = f62Var.getString(10)) != null) {
                    str2 = string2;
                }
                objArr[0] = str2;
                string = context2.getString(com.tencent.mm.R.string.mp8, objArr);
            } else if (integer != 2) {
                str = "";
                kotlin.jvm.internal.o.d(str);
                kotlin.jvm.internal.o.d(context2);
                fk2.f3.s(this, msg, context2, holder, str, null, 16, null);
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.f62 f62Var2 = (r45.f62) jh1Var.getCustom(1);
                if (f62Var2 != null && (list = f62Var2.getList(5)) != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedList.addAll(((r45.hd6) it.next()).getList(7));
                    }
                }
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                r45.f62 f62Var3 = (r45.f62) jh1Var.getCustom(1);
                if (f62Var3 != null && (string3 = f62Var3.getString(10)) != null) {
                    str2 = string3;
                }
                objArr2[0] = str2;
                zl2.r4 r4Var = zl2.r4.f473950a;
                kotlin.jvm.internal.o.d(context2);
                objArr2[1] = r4Var.J0(context2, linkedList);
                string = context2.getString(com.tencent.mm.R.string.mpe, objArr2);
            }
            str = string;
            kotlin.jvm.internal.o.d(str);
            kotlin.jvm.internal.o.d(context2);
            fk2.f3.s(this, msg, context2, holder, str, null, 16, null);
        }
        holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.cu_));
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.kf(msg);
    }

    @Override // we2.o
    public int n() {
        return 20120;
    }
}
