package un;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p f429317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(un.p pVar) {
        super(0);
        this.f429317d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f429317d.V6()).h("room_still_notify_message");
        if (h17 instanceof com.tencent.mm.chatroom.ui.preference.StillNotifyMessagePreference) {
            return (com.tencent.mm.chatroom.ui.preference.StillNotifyMessagePreference) h17;
        }
        return null;
    }
}
