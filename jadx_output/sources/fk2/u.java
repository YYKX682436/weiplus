package fk2;

/* loaded from: classes2.dex */
public final class u implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f263484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f263485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fk2.v f263486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f263487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f263488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f263489f;

    public u(com.tencent.mm.api.IEmojiInfo iEmojiInfo, android.view.View view, fk2.v vVar, android.view.View view2, android.view.View view3, android.view.View view4) {
        this.f263484a = iEmojiInfo;
        this.f263485b = view;
        this.f263486c = vVar;
        this.f263487d = view2;
        this.f263488e = view3;
        this.f263489f = view4;
    }

    @Override // sr.b
    public void a(int i17) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f263484a;
        boolean E0 = iEmojiInfo.E0();
        fk2.v vVar = this.f263486c;
        if (E0 || i17 == 1) {
            android.view.View view = this.f263485b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str = vVar.f263494m;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            java.lang.String md52 = iEmojiInfo.getMd5();
            objArr[1] = md52 != null ? md52 : "";
            com.tencent.mars.xlog.Log.i(str, "emojiStatus %d md5 %s", objArr);
            return;
        }
        if (i17 == 0) {
            android.view.View view2 = this.f263485b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f263487d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f263488e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f263489f;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str2 = vVar.f263494m;
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Integer.valueOf(i17);
            java.lang.String md53 = iEmojiInfo.getMd5();
            objArr2[1] = md53 != null ? md53 : "";
            com.tencent.mars.xlog.Log.i(str2, "emojiStatus %d md5 %s", objArr2);
            return;
        }
        if (i17 != -1) {
            if (iEmojiInfo.E0()) {
                return;
            }
            java.lang.String str3 = vVar.f263494m;
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            objArr3[0] = java.lang.Integer.valueOf(i17);
            java.lang.String md54 = iEmojiInfo.getMd5();
            objArr3[1] = md54 != null ? md54 : "";
            com.tencent.mars.xlog.Log.i(str3, "emojiStatus %d md5 %s not Exist", objArr3);
            return;
        }
        android.view.View view6 = this.f263485b;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = this.f263487d;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f263488e;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(0);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view9 = this.f263489f;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemBaseEmoji$loadEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String str4 = vVar.f263494m;
        java.lang.Object[] objArr4 = new java.lang.Object[2];
        objArr4[0] = java.lang.Integer.valueOf(i17);
        java.lang.String md55 = iEmojiInfo.getMd5();
        objArr4[1] = md55 != null ? md55 : "";
        com.tencent.mars.xlog.Log.i(str4, "emojiStatus %d md5 %s", objArr4);
    }
}
