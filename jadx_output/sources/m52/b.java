package m52;

/* loaded from: classes15.dex */
public final class b implements m52.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f323537a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Field f323538b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f323539c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f323540d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Field f323541e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Field f323542f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Field f323543g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Field f323544h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Field f323545i;

    public b() {
        try {
            this.f323537a = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder.class;
            java.lang.reflect.Field declaredField = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder.class.getDeclaredField("timeLineObject");
            this.f323538b = declaredField;
            declaredField.setAccessible(true);
            java.lang.reflect.Field declaredField2 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder.class.getDeclaredField("isAd");
            this.f323540d = declaredField2;
            declaredField2.setAccessible(true);
            int i17 = com.tencent.mm.protocal.protobuf.TimeLineObject.f192185d;
            java.lang.reflect.Field declaredField3 = com.tencent.mm.protocal.protobuf.TimeLineObject.class.getDeclaredField("Id");
            this.f323539c = declaredField3;
            declaredField3.setAccessible(true);
            java.lang.reflect.Field declaredField4 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder.class.getDeclaredField("snsobj");
            this.f323541e = declaredField4;
            declaredField4.setAccessible(true);
            int i18 = com.tencent.mm.protocal.protobuf.SnsObject.f192184d;
            java.lang.reflect.Field declaredField5 = com.tencent.mm.protocal.protobuf.SnsObject.class.getDeclaredField("CommentUserList");
            this.f323543g = declaredField5;
            declaredField5.setAccessible(true);
            java.lang.reflect.Field declaredField6 = com.tencent.mm.protocal.protobuf.SnsObject.class.getDeclaredField("LikeCount");
            this.f323542f = declaredField6;
            declaredField6.setAccessible(true);
            java.lang.reflect.Field declaredField7 = com.tencent.mm.protocal.protobuf.SnsObject.class.getDeclaredField("Username");
            this.f323544h = declaredField7;
            declaredField7.setAccessible(true);
            java.lang.reflect.Field declaredField8 = com.tencent.mm.protocal.protobuf.SnsObject.class.getDeclaredField("Nickname");
            this.f323545i = declaredField8;
            declaredField8.setAccessible(true);
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String a(android.view.View view, int i17) {
        java.lang.Object tag = view.getTag();
        if (tag == null) {
            return null;
        }
        try {
            if (!this.f323537a.isInstance(tag)) {
                return null;
            }
            java.lang.Object obj = this.f323538b.get(tag);
            if (obj == null) {
                return null;
            }
            try {
                return (java.lang.String) this.f323539c.get(obj);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.SnsFeedParamCatcher", e17, "getFeedParams.feedId: ", new java.lang.Object[0]);
                return null;
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
