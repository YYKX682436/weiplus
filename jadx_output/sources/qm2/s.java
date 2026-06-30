package qm2;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f364746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm2.u f364747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f364748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r45.h32 h32Var, qm2.u uVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f364746d = h32Var;
        this.f364747e = uVar;
        this.f364748f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qm2.s(this.f364746d, this.f364747e, this.f364748f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qm2.s sVar = (qm2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j2 j2Var;
        kotlinx.coroutines.flow.j2 j2Var2;
        mm2.y6 y6Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        r45.t32 t32Var;
        java.util.LinkedList list;
        r45.t32 t32Var2;
        r45.t32 t32Var3;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.h32 noticeInfo = this.f364746d;
        long integer = noticeInfo.getInteger(0) * 1000;
        int integer2 = noticeInfo.getInteger(20);
        qm2.u uVar = this.f364747e;
        if (integer2 == 1) {
            android.widget.TextView textView = uVar.f364753e;
            if (textView != null) {
                textView.setText(uVar.getContext().getResources().getString(com.tencent.mm.R.string.mi8));
            }
        } else {
            java.util.Date date = new java.util.Date(integer);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(date);
            int i17 = calendar.get(2) + 1;
            int i18 = calendar.get(5);
            zl2.q4 q4Var = zl2.q4.f473933a;
            java.lang.String z17 = q4Var.z(calendar.get(11));
            java.lang.String z18 = q4Var.z(calendar.get(12));
            int i19 = (!zl2.r4.f473950a.Y1(uVar.getContext()) || j65.f.f297943g <= 1.0f) ? noticeInfo.getInteger(18) == 1 ? com.tencent.mm.R.string.m97 : com.tencent.mm.R.string.m0i : com.tencent.mm.R.string.lup;
            android.widget.TextView textView2 = uVar.f364753e;
            if (textView2 != null) {
                textView2.setText(uVar.getContext().getResources().getString(i19, new java.lang.Integer(i17), new java.lang.Integer(i18), z17, z18));
            }
        }
        java.lang.String string = noticeInfo.getString(3);
        mm2.y6 y6Var2 = null;
        if (string != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
                gk2.e eVar = uVar.f364757i;
                kotlinx.coroutines.flow.j2 j2Var3 = eVar != null ? ((mm2.g1) eVar.a(mm2.g1.class)).f329076q : null;
                if (j2Var3 != null) {
                    ((kotlinx.coroutines.flow.h3) j2Var3).k(string);
                }
            }
        }
        java.lang.String string2 = noticeInfo.getString(23);
        if (string2 != null) {
            if (!(string2.length() > 0)) {
                string2 = null;
            }
            if (string2 != null) {
                gk2.e eVar2 = uVar.f364757i;
                kotlinx.coroutines.flow.j2 j2Var4 = eVar2 != null ? ((mm2.g1) eVar2.a(mm2.g1.class)).f329077r : null;
                if (j2Var4 != null) {
                    ((kotlinx.coroutines.flow.h3) j2Var4).k(string2);
                }
            }
        }
        r45.q65 q65Var = (r45.q65) noticeInfo.getCustom(10);
        if ((q65Var != null && q65Var.getBoolean(0)) && this.f364748f) {
            gk2.e eVar3 = uVar.f364757i;
            if (eVar3 != null && (j2Var2 = ((mm2.g1) eVar3.a(mm2.g1.class)).f329078s) != null && (y6Var = (mm2.y6) ((kotlinx.coroutines.flow.h3) j2Var2).getValue()) != null) {
                kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
                r45.hn1 hn1Var = new r45.hn1();
                r45.re2 re2Var = new r45.re2();
                r45.q65 q65Var2 = (r45.q65) noticeInfo.getCustom(10);
                if (q65Var2 == null || (t32Var3 = (r45.t32) q65Var2.getCustom(6)) == null || (linkedList = t32Var3.getList(1)) == null) {
                    linkedList = new java.util.LinkedList();
                }
                re2Var.set(0, linkedList);
                r45.q65 q65Var3 = (r45.q65) noticeInfo.getCustom(10);
                if (q65Var3 == null || (t32Var2 = (r45.t32) q65Var3.getCustom(6)) == null || (linkedList2 = t32Var2.getList(2)) == null) {
                    linkedList2 = new java.util.LinkedList();
                }
                re2Var.set(1, linkedList2);
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                linkedList4.addAll(re2Var.getList(0));
                linkedList4.addAll(re2Var.getList(1));
                re2Var.set(2, linkedList4);
                r45.q65 q65Var4 = (r45.q65) noticeInfo.getCustom(10);
                if (q65Var4 == null || (t32Var = (r45.t32) q65Var4.getCustom(6)) == null || (list = t32Var.getList(6)) == null) {
                    linkedList3 = new java.util.LinkedList();
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf((java.lang.Integer) it.next()));
                    }
                    linkedList3 = new java.util.LinkedList(arrayList);
                }
                re2Var.set(4, linkedList3);
                hn1Var.set(2, re2Var);
                hn1Var.set(0, 2);
                r45.q65 q65Var5 = (r45.q65) noticeInfo.getCustom(10);
                hn1Var.set(1, java.lang.Integer.valueOf(q65Var5 != null ? q65Var5.getInteger(1) : 0));
                y6Var.i(hn1Var);
                y6Var.f329581e = y6Var.a(0);
            }
            gk2.e eVar4 = uVar.f364757i;
            if (eVar4 != null && (j2Var = ((mm2.g1) eVar4.a(mm2.g1.class)).f329078s) != null) {
                y6Var2 = (mm2.y6) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
            }
            if (y6Var2 != null) {
                y6Var2.f329591o = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
