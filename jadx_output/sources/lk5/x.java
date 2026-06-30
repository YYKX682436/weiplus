package lk5;

/* loaded from: classes11.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonActivity f319067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.ui.vas.VASCommonActivity vASCommonActivity) {
        super(0);
        this.f319067d = vASCommonActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f319067d.getIntent();
        android.content.Intent intent2 = intent != null ? (android.content.Intent) intent.getParcelableExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_FRAGMENT_INTENT) : null;
        android.content.Intent intent3 = intent2 instanceof android.content.Intent ? intent2 : null;
        return intent3 == null ? new android.content.Intent() : intent3;
    }
}
