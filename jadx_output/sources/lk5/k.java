package lk5;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASActivity f319039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.ui.vas.VASActivity vASActivity) {
        super(0);
        this.f319039d = vASActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f319039d.getIntent().getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_VAS_PAGE_ANIM, false));
    }
}
