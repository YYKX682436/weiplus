package px0;

/* loaded from: classes5.dex */
public final class m implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f358788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358789b;

    public m(android.widget.TextView textView, com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        this.f358788a = textView;
        this.f358789b = materialImportPreviewFragment;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.Map l17 = kz5.c1.l(new jz5.l("aigc_wait_text", this.f358788a.getText().toString()));
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment.f69642z;
        return kz5.c1.m(l17, (java.util.Map) ((jz5.n) this.f358789b.f69661y).getValue());
    }
}
