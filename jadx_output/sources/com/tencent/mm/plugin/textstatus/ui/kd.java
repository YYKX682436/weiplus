package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class kd extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f174037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f174037d = new java.util.ArrayList();
    }

    public final void O6(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusLikeUIC", "markLike: failed", null);
            return;
        }
        java.util.ArrayList arrayList = this.f174037d;
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        java.lang.String str2 = "[markLike] statusId = " + str + ", likeList = " + arrayList;
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusLikeUIC", str2, null);
    }

    public final void P6(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusLikeUIC", "markLike: failed", null);
            return;
        }
        java.util.ArrayList arrayList = this.f174037d;
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        }
        java.lang.String str2 = "[markUnLike] statusId = " + str + ", likeList = " + arrayList;
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusLikeUIC", str2, null);
    }
}
