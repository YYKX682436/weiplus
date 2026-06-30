package w71;

/* loaded from: classes11.dex */
public class r1 extends com.tencent.unit_rc.BaseProxyObject implements w71.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f443439d = {false};

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        synchronized (this) {
            this.f443439d[i17] = false;
        }
    }
}
