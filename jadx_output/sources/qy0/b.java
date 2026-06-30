package qy0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f367560e;

    /* renamed from: f, reason: collision with root package name */
    public int f367561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager f367562g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f367563h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367564i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager, com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367562g = mMMusicManager;
        this.f367563h = mJMusicInfo;
        this.f367564i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy0.b(this.f367562g, this.f367563h, this.f367564i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        gz0.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367561f;
        com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager = this.f367562g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((n0.q4) mMMusicManager.f69745g).setValue(this.f367563h);
            gz0.h hVar2 = mMMusicManager.f69748m;
            if (hVar2 != null) {
                this.f367561f = 1;
                if (hVar2.d(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager mMMusicManager2 = (com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager) this.f367560e;
                hVar = (gz0.h) this.f367559d;
                kotlin.ResultKt.throwOnFailure(obj);
                mMMusicManager = mMMusicManager2;
                mMMusicManager.f69748m = hVar;
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.Iterator it = mMMusicManager.f69747i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(java.lang.String.valueOf(((r45.mh4) obj2).f380508d), this.f367564i)) {
                break;
            }
        }
        r45.mh4 mh4Var = (r45.mh4) obj2;
        java.lang.String str = mh4Var != null ? mh4Var.f380511g : null;
        if (str == null) {
            str = "";
        }
        hVar = new gz0.h(str, 0L, 0L, 4, null);
        if (!((java.lang.Boolean) ((n0.q4) mMMusicManager.f69746h).getValue()).booleanValue()) {
            this.f367559d = hVar;
            this.f367560e = mMMusicManager;
            this.f367561f = 2;
            if (hVar.c(this) == aVar) {
                return aVar;
            }
        }
        mMMusicManager.f69748m = hVar;
        return jz5.f0.f302826a;
    }
}
