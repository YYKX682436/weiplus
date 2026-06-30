package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class p implements com.tencent.mm.plugin.vlog.model.g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.o f175702f = new com.tencent.mm.plugin.vlog.model.o(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.h1 f175703a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.i70 f175704b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.g70 f175705c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f175706d;

    /* renamed from: e, reason: collision with root package name */
    public r45.tz6 f175707e;

    public p(com.tencent.mm.plugin.vlog.model.h1 composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        this.f175703a = composition;
        this.f175704b = new r45.i70();
        this.f175705c = new r45.g70();
        this.f175706d = new java.util.LinkedList();
    }

    public final void b(android.graphics.Rect drawingRect, float[] validRect, java.util.List editItems) {
        kotlin.jvm.internal.o.g(drawingRect, "drawingRect");
        kotlin.jvm.internal.o.g(validRect, "validRect");
        kotlin.jvm.internal.o.g(editItems, "editItems");
        r45.vl5 vl5Var = new r45.vl5();
        r45.g70 g70Var = this.f175705c;
        g70Var.f374938d = vl5Var;
        r45.vl5 drawingRect2 = g70Var.f374938d;
        kotlin.jvm.internal.o.f(drawingRect2, "drawingRect");
        com.tencent.mm.plugin.vlog.model.x.g(drawingRect, drawingRect2);
        g70Var.f374941g = new r45.vl5();
        android.graphics.Rect rect = new android.graphics.Rect((int) validRect[0], (int) validRect[1], (int) validRect[2], (int) validRect[3]);
        r45.vl5 validRect2 = g70Var.f374941g;
        kotlin.jvm.internal.o.f(validRect2, "validRect");
        com.tencent.mm.plugin.vlog.model.x.g(rect, validRect2);
        java.util.LinkedList linkedList = g70Var.f374939e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(editItems, 10));
        java.util.Iterator it = editItems.iterator();
        while (it.hasNext()) {
            zu3.a aVar = (zu3.a) it.next();
            r45.de deVar = new r45.de();
            deVar.f372338d = aVar.f475758a.f475805d;
            deVar.f372339e = x51.j1.a(aVar.toProtoBuf().toByteArray());
            arrayList.add(deVar);
        }
        linkedList.addAll(arrayList);
    }

    public final void c(java.util.List magicList) {
        kotlin.jvm.internal.o.g(magicList, "magicList");
        java.util.Iterator it = magicList.iterator();
        while (it.hasNext()) {
            ro4.b bVar = (ro4.b) it.next();
            java.util.LinkedList linkedList = this.f175706d;
            r45.ci4 ci4Var = new r45.ci4();
            ci4Var.f371574d = bVar.f398118b.f398116a;
            ci4Var.f371575e = bVar.f398120d;
            ci4Var.f371576f = bVar.f398121e;
            linkedList.add(ci4Var);
        }
    }

    public final void d(so4.b template) {
        kotlin.jvm.internal.o.g(template, "template");
        java.util.List list = com.tencent.mm.plugin.vlog.model.x.f175780a;
        r45.tz6 tz6Var = new r45.tz6();
        template.getClass();
        tz6Var.f386890d = null;
        java.lang.String str = lp0.b.e() + java.lang.System.currentTimeMillis() + ".mp3";
        template.getClass();
        com.tencent.mm.vfs.w6.c(null, str);
        tz6Var.f386891e = str;
        template.getClass();
        tz6Var.f386892f = 0L;
        template.getClass();
        tz6Var.f386893g = false;
        this.f175707e = tz6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[LOOP:3: B:107:0x028a->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.i70 e(java.lang.String r21, com.tencent.mm.modelcontrol.VideoTransPara r22, android.util.Size r23, android.graphics.Rect r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.model.p.e(java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, android.util.Size, android.graphics.Rect, boolean, boolean):r45.i70");
    }

    public r45.h70 f() {
        r45.h70 a17 = com.tencent.mm.plugin.vlog.model.x.a(this.f175703a, this.f175704b);
        a17.f375904n = this.f175705c;
        a17.f375905o.addAll(this.f175706d);
        r45.tz6 tz6Var = this.f175707e;
        a17.f375906p = tz6Var;
        if (tz6Var != null) {
            a17.f375900g = false;
        }
        return a17;
    }
}
