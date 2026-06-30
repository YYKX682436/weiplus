package sx3;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx3.m f413551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox3.g f413552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sx3.m mVar, ox3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f413551d = mVar;
        this.f413552e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sx3.c(this.f413551d, this.f413552e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sx3.c cVar = (sx3.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r3 == true) goto L27;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r11)
            sx3.m r11 = r10.f413551d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r11.O6()
            r1 = 1
            r0.e(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r11.f413568g
            r2 = 0
            if (r0 == 0) goto L1f
            java.util.List r0 = r0.getData()
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            goto L20
        L1f:
            r0 = r2
        L20:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = r11.f413568g
            ox3.g r4 = r10.f413552e
            if (r3 == 0) goto L59
            java.util.List r3 = r3.getData()
            if (r3 == 0) goto L59
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L34
        L32:
            r3 = r1
            goto L56
        L34:
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r5 = r3.next()
            ox3.f r5 = (ox3.f) r5
            long r6 = r4.getItemId()
            long r8 = r5.getItemId()
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 != 0) goto L52
            r5 = r1
            goto L53
        L52:
            r5 = r2
        L53:
            if (r5 == 0) goto L38
            r3 = r2
        L56:
            if (r3 != r1) goto L59
            goto L5a
        L59:
            r1 = r2
        L5a:
            if (r1 == 0) goto L69
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r11.f413568g
            if (r1 == 0) goto L69
            java.util.List r1 = r1.getData()
            if (r1 == 0) goto L69
            r1.add(r4)
        L69:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r11 = r11.f413568g
            if (r11 == 0) goto L70
            r11.notifyItemInserted(r0)
        L70:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sx3.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
