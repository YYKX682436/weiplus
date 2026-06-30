package rk4;

/* loaded from: classes16.dex */
public final class t4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final rk4.t4 f396979d = new rk4.t4();

    public t4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(java.lang.Integer.valueOf(com.tencent.pigeon.ting.TingCommonEvent.CATEGORY_LIKE_STATUS_CHANGE.ordinal()), 1);
        linkedHashMap.put(java.lang.Integer.valueOf(com.tencent.pigeon.ting.TingCommonEvent.CATEGORY_INFO_EDITED.ordinal()), 2);
        linkedHashMap.put(java.lang.Integer.valueOf(com.tencent.pigeon.ting.TingCommonEvent.CATEGORY_PUBLIC_STATUS_CHANGE.ordinal()), 3);
        linkedHashMap.put(java.lang.Integer.valueOf(com.tencent.pigeon.ting.TingCommonEvent.CATEGORY_DELETED.ordinal()), 4);
        linkedHashMap.put(java.lang.Integer.valueOf(com.tencent.pigeon.ting.TingCommonEvent.CATEGORY_RELOAD.ordinal()), 5);
        return linkedHashMap;
    }
}
