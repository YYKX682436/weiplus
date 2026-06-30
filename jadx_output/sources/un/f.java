package un;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.h f429251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(un.h hVar) {
        super(0);
        this.f429251d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f429251d.V6()).h("room_set_to_conv_box");
        if (h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
            return (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17;
        }
        return null;
    }
}
