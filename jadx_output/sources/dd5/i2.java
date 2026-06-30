package dd5;

/* loaded from: classes9.dex */
public final class i2 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.i2 f229172p = new dd5.i2();

    public i2() {
        super(dd5.l2.f229203b.f426539a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.k2 k2Var = (dd5.k2) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (k2Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        java.lang.CharSequence charSequence = k2Var.f229193a;
        if (r26.n0.N(charSequence)) {
            charSequence = context.getResources().getString(com.tencent.mm.R.string.f490506x0);
            kotlin.jvm.internal.o.f(charSequence, "getString(...)");
        }
        z(d17, context, charSequence);
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        z(b17, context, k2Var.f229194b);
        A(context, binding, com.tencent.mm.R.raw.note_regular);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.k2 k2Var = (dd5.k2) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (k2Var == null) {
            return;
        }
        com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
        am.sn snVar = openNoteFromSessionEvent.f54599g;
        snVar.f7906c = context;
        com.tencent.mm.storage.f9 f9Var = k2Var.f229196d;
        snVar.f7904a = f9Var.getMsgId();
        openNoteFromSessionEvent.f54599g.f7909f = f9Var.Q0();
        am.sn snVar2 = openNoteFromSessionEvent.f54599g;
        snVar2.f7907d = false;
        snVar2.f7905b = k2Var.f229195c;
        snVar2.f7910g = 6;
        openNoteFromSessionEvent.e();
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.CharSequence string;
        java.lang.String U1 = f9Var.U1();
        int i17 = 0;
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        int i18 = bVar.f368365d;
        java.lang.String string2 = bVar.getString(i18 + 3);
        java.lang.String str = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            string = bVar.getString(i18 + 2);
        } else {
            if (string2.length() > 1000) {
                string2 = string2.substring(0, 1000);
                kotlin.jvm.internal.o.f(string2, "substring(...)");
            }
            java.util.List f07 = r26.n0.f0(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(string2, "&lt;", "<", false), "&gt;", ">", false), "&amp;", "&", false), " ", " ", false), new java.lang.String[]{"\n"}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = f07.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    i19 = 0;
                    break;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(r26.n0.u0((java.lang.String) f07.get(i19)).toString())) {
                    arrayList.add(f07.get(i19));
                    break;
                }
                i19++;
            }
            int size2 = f07.size();
            java.lang.String str2 = "";
            for (int i27 = i19 + 1; i27 < size2; i27++) {
                str2 = str2 + ((java.lang.String) f07.get(i27)) + ' ';
            }
            java.lang.String obj = r26.n0.u0(str2).toString();
            if (obj.length() > 0) {
                arrayList.add(obj);
            }
            if (arrayList.size() > 0) {
                string = (java.lang.CharSequence) arrayList.get(0);
                i17 = 1;
            } else {
                string = bVar.getString(i18 + 2);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size3 = arrayList.size();
            while (i17 < size3) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            java.util.List K0 = kz5.n0.K0(arrayList2, 2);
            if (true ^ K0.isEmpty()) {
                str = kz5.n0.g0(K0, "\n", null, null, 0, null, null, 62, null);
            }
        }
        return new dd5.k2(string, str, bVar.getString(bVar.f432315e + 44), f9Var);
    }
}
