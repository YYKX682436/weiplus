package cw2;

/* loaded from: classes2.dex */
public final class w8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f224093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        super(0);
        this.f224093d = finderVideoLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f224093d;
        android.view.View findViewById = finderVideoLayout.findViewById(com.tencent.mm.R.id.m2_);
        findViewById.setOnClickListener(new cw2.v8(finderVideoLayout));
        return findViewById;
    }
}
