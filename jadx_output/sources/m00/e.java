package m00;

/* loaded from: classes.dex */
public final class e implements b30.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322531a;

    public e(yz5.l lVar) {
        this.f322531a = lVar;
    }

    @Override // b30.e
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (i17 != 4359) {
            return false;
        }
        this.f322531a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(i18 == -1 ? m00.f.a(m00.f.f322532a, intent) : new com.tencent.pigeon.ecs.EcsAddressStruct(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null))));
        return true;
    }
}
