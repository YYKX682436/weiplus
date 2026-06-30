package t93;

/* loaded from: classes.dex */
public class k implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t93.l f416576a;

    public k(t93.l lVar) {
        this.f416576a = lVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        int intValue = ((java.lang.Integer) obj).intValue();
        if (intValue == 1) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "创建成功");
            hashMap.put("code", 100);
            hashMap.put("err_msg", "openFinderCreateAcctView:ok");
        } else if (intValue == 2) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "用户取消");
            hashMap.put("code", 200);
            hashMap.put("err_msg", "openFinderCreateAcctView:cancel");
        } else if (intValue == 3) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "参数为空");
            hashMap.put("code", 300);
            hashMap.put("err_msg", "openFinderCreateAcctView:fail");
        } else if (intValue == 4) {
            hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "账号已存在");
            hashMap.put("code", 301);
            hashMap.put("err_msg", "openFinderCreateAcctView:fail");
        }
        this.f416576a.f143443f.b(hashMap);
    }
}
