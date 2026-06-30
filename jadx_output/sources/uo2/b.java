package uo2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView f429601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
        super(2);
        this.f429601d = finderFollowTopicHeaderView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success:");
        sb6.append(booleanValue);
        sb6.append(" , filePath:");
        sb6.append(str);
        sb6.append(", fileExist:");
        com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f429601d;
        sb6.append(o35.a.b(finderFollowTopicHeaderView.getFilePath()));
        com.tencent.mars.xlog.Log.i("FinderFollowTopicHeaderView", sb6.toString());
        pm0.v.X(new uo2.a(finderFollowTopicHeaderView, str, booleanValue));
        return jz5.f0.f302826a;
    }
}
