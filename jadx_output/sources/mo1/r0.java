package mo1;

/* loaded from: classes5.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f330325d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f330326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330327f;

    /* renamed from: g, reason: collision with root package name */
    public int f330328g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f330327f = roamLiteTaskDetailUI;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f330326e = obj;
        this.f330328g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.U6(this.f330327f, null, null, null, this);
    }
}
