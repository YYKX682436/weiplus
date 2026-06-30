package dz4;

/* loaded from: classes11.dex */
public final class d4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245201d;

    /* renamed from: e, reason: collision with root package name */
    public long f245202e;

    /* renamed from: f, reason: collision with root package name */
    public int f245203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz4.g f245204g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f245205h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245206i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.wcrte.h f245207m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(dz4.g gVar, dz4.h4 h4Var, android.app.Activity activity, com.tencent.wechat.aff.wcrte.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245204g = gVar;
        this.f245205h = h4Var;
        this.f245206i = activity;
        this.f245207m = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.d4(this.f245204g, this.f245205h, this.f245206i, this.f245207m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz4.d4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:2)|(1:(1:(1:(3:(1:(1:9)(2:13|14))(1:15)|10|11)(8:16|17|18|(1:20)|21|(1:23)|10|11))(18:29|30|31|(1:34)|38|39|40|(1:42)(1:50)|43|(1:45)(1:49)|46|(1:48)|18|(0)|21|(0)|10|11))(1:51))(3:59|60|(1:62))|52|53|54|55|(1:57)(17:58|31|(1:34)|38|39|40|(0)(0)|43|(0)(0)|46|(0)|18|(0)|21|(0)|10|11)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0110, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.d4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
