package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class qb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f201302d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f201303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f201304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f201305g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ub f201306h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f201307i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201308m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ob f201309n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f201310o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(yz5.a aVar, android.widget.TextView textView, com.tencent.mm.ui.chatting.gallery.ub ubVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, com.tencent.mm.ui.chatting.gallery.ob obVar, yz5.a aVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201304f = aVar;
        this.f201305g = textView;
        this.f201306h = ubVar;
        this.f201307i = appCompatActivity;
        this.f201308m = str;
        this.f201309n = obVar;
        this.f201310o = aVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.gallery.qb qbVar = new com.tencent.mm.ui.chatting.gallery.qb(this.f201304f, this.f201305g, this.f201306h, this.f201307i, this.f201308m, this.f201309n, this.f201310o, continuation);
        qbVar.f201303e = obj;
        return qbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.qb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:6:0x006b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f201302d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r12.f201303e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r13)
            r4 = r12
            goto L6b
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            java.lang.Object r1 = r12.f201303e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L44
        L26:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f201303e
            kotlinx.coroutines.y0 r13 = (kotlinx.coroutines.y0) r13
            r1 = r12
        L2e:
            boolean r4 = kotlinx.coroutines.z0.h(r13)
            if (r4 == 0) goto L90
            r1.f201303e = r13
            r1.f201302d = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = kotlinx.coroutines.k1.b(r4, r1)
            if (r4 != r0) goto L41
            return r0
        L41:
            r11 = r1
            r1 = r13
            r13 = r11
        L44:
            boolean r4 = kotlinx.coroutines.z0.h(r1)
            if (r4 == 0) goto L90
            yz5.a r4 = r13.f201304f
            if (r4 != 0) goto L4f
            goto L90
        L4f:
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310570c
            com.tencent.mm.ui.chatting.gallery.pb r5 = new com.tencent.mm.ui.chatting.gallery.pb
            yz5.a r6 = r13.f201310o
            r7 = 0
            com.tencent.mm.ui.chatting.gallery.ub r8 = r13.f201306h
            java.lang.String r9 = r13.f201308m
            r5.<init>(r8, r9, r6, r7)
            r13.f201303e = r1
            r13.f201302d = r2
            java.lang.Object r4 = kotlinx.coroutines.l.g(r4, r5, r13)
            if (r4 != r0) goto L68
            return r0
        L68:
            r11 = r4
            r4 = r13
            r13 = r11
        L6b:
            com.tencent.mm.ui.chatting.gallery.nb r13 = (com.tencent.mm.ui.chatting.gallery.nb) r13
            com.tencent.mm.ui.chatting.gallery.ub r5 = r4.f201306h
            androidx.appcompat.app.AppCompatActivity r6 = r4.f201307i
            java.lang.String r7 = r4.f201308m
            com.tencent.mm.ui.chatting.gallery.ob r8 = r4.f201309n
            yz5.a r9 = r4.f201310o
            java.lang.Object r9 = r9.invoke()
            r10 = r9
            com.tencent.mm.ui.chatting.gallery.mb r10 = (com.tencent.mm.ui.chatting.gallery.mb) r10
            r9 = r13
            android.text.SpannableStringBuilder r5 = com.tencent.mm.ui.chatting.gallery.ub.b(r5, r6, r7, r8, r9, r10)
            android.widget.TextView r6 = r4.f201305g
            r6.setText(r5)
            boolean r13 = r13.f201229c
            if (r13 == 0) goto L8d
            goto L90
        L8d:
            r13 = r1
            r1 = r4
            goto L2e
        L90:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.qb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
