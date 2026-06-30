package tc0;

@j95.b
/* loaded from: classes.dex */
public class m extends i95.w implements uc0.q {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            jz5.g gVar = iw3.b.f295233a;
            iw3.f fVar = iw3.f.f295237b;
            java.util.Map jsApiList = (java.util.Map) ((jz5.n) iw3.b.f295233a).getValue();
            kotlin.jvm.internal.o.g(jsApiList, "jsApiList");
            java.util.HashMap hashMap = (java.util.HashMap) iw3.f.f295238c;
            hashMap.clear();
            hashMap.putAll(jsApiList);
        }
    }
}
