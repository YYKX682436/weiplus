package vh0;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvh0/a2;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-yuanbao_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a2 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        data.setClassLoader(vh0.a2.class.getClassLoader());
        java.lang.String string = data.getString(dm.i4.COL_USERNAME);
        kotlin.jvm.internal.o.d(string);
        java.util.ArrayList parcelableArrayList = data.getParcelableArrayList("agreements");
        kotlin.jvm.internal.o.d(parcelableArrayList);
        ((vh0.f2) ((vh0.d1) i95.n0.c(vh0.d1.class))).Ni(string, parcelableArrayList, data.getBoolean("agreed"));
    }
}
