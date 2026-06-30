package tj3;

/* loaded from: classes8.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout f419797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout multiTalkAvatarLayout) {
        super(0);
        this.f419797d = multiTalkAvatarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout multiTalkAvatarLayout = this.f419797d;
        if (multiTalkAvatarLayout.getVisibility() == 0) {
            multiTalkAvatarLayout.d(false);
        }
        return jz5.f0.f302826a;
    }
}
