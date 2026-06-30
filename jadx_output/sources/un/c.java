package un;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.h f429240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(un.h hVar) {
        super(0);
        this.f429240d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f429240d.V6()).h("room_placed_to_the_top");
        if (h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
            return (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17;
        }
        return null;
    }
}
