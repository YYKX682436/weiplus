package s61;

/* loaded from: classes8.dex */
public class r0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.g1 f403386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI f403387e;

    public r0(com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI recommendFriendUI, r61.g1 g1Var) {
        this.f403387e = recommendFriendUI;
        this.f403386d = g1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f403386d);
        this.f403387e.finish();
    }
}
