package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes13.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView f204768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView chattingMediaGroupBaseItemMvvmView) {
        super(0);
        this.f204768d = chattingMediaGroupBaseItemMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView.f204700i;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView chattingMediaGroupBaseItemMvvmView = this.f204768d;
        for (java.lang.Class<?> cls = chattingMediaGroupBaseItemMvvmView.getClass(); cls != null && !kotlin.jvm.internal.o.b(cls, java.lang.Object.class); cls = cls.getSuperclass()) {
            java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) genericSuperclass;
                java.lang.reflect.Type rawType = parameterizedType.getRawType();
                java.lang.Class cls2 = rawType instanceof java.lang.Class ? (java.lang.Class) rawType : null;
                if (cls2 != null && kotlin.jvm.internal.o.b(cls2, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView.class)) {
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    kotlin.jvm.internal.o.f(actualTypeArguments, "getActualTypeArguments(...)");
                    java.lang.Class h17 = chattingMediaGroupBaseItemMvvmView.h((java.lang.reflect.Type) kz5.z.O(actualTypeArguments));
                    if (h17 != null && b11.a.class.isAssignableFrom(h17)) {
                        return h17;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingMediaGroupBaseItemMvvmView", "resolveViewModelClazz failed, fallback to IMediaViewModel");
        return b11.a.class;
    }
}
