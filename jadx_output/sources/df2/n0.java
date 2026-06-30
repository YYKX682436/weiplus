package df2;

/* loaded from: classes3.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f230822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yg7 f230824g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f230825h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(df2.v0 v0Var, java.lang.String str, r45.yg7 yg7Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230822e = v0Var;
        this.f230823f = str;
        this.f230824g = yg7Var;
        this.f230825h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.n0(this.f230822e, this.f230823f, this.f230824g, this.f230825h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f230821d
            r2 = 2
            r3 = 1
            df2.v0 r4 = r6.f230822e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L45
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L38
        L1e:
            kotlin.ResultKt.throwOnFailure(r7)
            df2.v0.a7(r4)
            java.lang.String r7 = r6.f230823f
            java.lang.String r1 = "$filePath"
            kotlin.jvm.internal.o.f(r7, r1)
            r6.f230821d = r3
            r45.yg7 r1 = r6.f230824g
            boolean r5 = r6.f230825h
            java.lang.Object r7 = r4.d7(r7, r1, r5, r6)
            if (r7 != r0) goto L38
            return r0
        L38:
            r45.lw1 r7 = (r45.lw1) r7
            if (r7 == 0) goto L4a
            r6.f230821d = r2
            java.lang.Object r7 = r4.b7(r7, r3, r3, r6)
            if (r7 != r0) goto L45
            return r0
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
        L4a:
            com.tencent.mm.ui.widget.dialog.u3 r7 = r4.f231576q
            if (r7 == 0) goto L51
            r7.dismiss()
        L51:
            az2.j r7 = r4.f231575p
            if (r7 == 0) goto L58
            r7.j()
        L58:
            r7 = 0
            r4.f231576q = r7
            java.lang.Class<df2.od> r7 = df2.od.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r4.controller(r7)
            df2.od r7 = (df2.od) r7
            if (r7 == 0) goto L6a
            r45.n72 r0 = r45.n72.kActionType_SetLiveRoomCoverImg
            r7.e7(r0)
        L6a:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
