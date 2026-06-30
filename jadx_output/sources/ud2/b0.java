package ud2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f426587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ud2.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426587e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ud2.b0(this.f426587e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ud2.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.nw1 liveInfo;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f426586d;
        ud2.c0 c0Var = this.f426587e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f426586d = 1;
            obj = ud2.c0.b(c0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        if (finderObject != null) {
            r45.nw1 liveInfo2 = finderObject.getLiveInfo();
            java.lang.Long l17 = null;
            java.lang.Long l18 = liveInfo2 != null ? new java.lang.Long(liveInfo2.getLong(0)) : null;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = c0Var.f426596g;
            if (finderItem != null && (liveInfo = finderItem.getLiveInfo()) != null) {
                l17 = new java.lang.Long(liveInfo.getLong(0));
            }
            if (!kotlin.jvm.internal.o.b(l18, l17)) {
                c0Var.f426596g = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
            }
        }
        c0Var.d();
        return jz5.f0.f302826a;
    }
}
