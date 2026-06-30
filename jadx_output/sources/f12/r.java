package f12;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        super(0);
        this.f258668d = springLuckyEggActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258668d;
        if (springLuckyEggActivity.getIntent().getExtras() != null) {
            return java.lang.Boolean.valueOf(springLuckyEggActivity.getIntent().getBooleanExtra("is_chat_room", false));
        }
        throw new java.lang.IllegalStateException("Required value was null.".toString());
    }
}
