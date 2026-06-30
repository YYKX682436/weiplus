package wo1;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter f447955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter backedUpConversationAdapter, java.lang.String str, android.content.Context context) {
        super(0);
        this.f447955d = backedUpConversationAdapter;
        this.f447956e = str;
        this.f447957f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap;
        com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter backedUpConversationAdapter = this.f447955d;
        hashMap = backedUpConversationAdapter.spannedName;
        oo1.g gVar = oo1.g.f347143a;
        android.content.Context context = this.f447957f;
        java.lang.String str = this.f447956e;
        hashMap.put(str, gVar.a(context, str));
        backedUpConversationAdapter.notifyUserdataChanged(str);
        return jz5.f0.f302826a;
    }
}
