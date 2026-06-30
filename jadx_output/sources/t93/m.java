package t93;

/* loaded from: classes.dex */
public final class m implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t93.n f416577a;

    public m(t93.n nVar) {
        this.f416577a = nVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (num != null && num.intValue() == 1) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "创建成功");
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((c61.l7) b6Var).getClass();
            hashMap.put("finderUsername", xy2.c.e(context));
            hashMap.put("code", 100);
            hashMap.put("err_msg", "OpenFinderCreateContactHalfVC:ok");
        } else if (num != null && num.intValue() == 2) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "用户取消");
            hashMap.put("code", 200);
            hashMap.put("err_msg", "OpenFinderCreateContactHalfVC:cancel");
        } else if (num != null && num.intValue() == 3) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "参数为空");
            hashMap.put("code", 300);
            hashMap.put("err_msg", "OpenFinderCreateContactHalfVC:fail");
        } else if (num != null && num.intValue() == 4) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "账号已存在");
            hashMap.put("code", 301);
            zy2.b6 b6Var2 = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((c61.l7) b6Var2).getClass();
            hashMap.put("finderUsername", xy2.c.e(context2));
            hashMap.put("err_msg", "OpenFinderCreateContactHalfVC:fail");
        }
        this.f416577a.f143443f.b(hashMap);
    }
}
