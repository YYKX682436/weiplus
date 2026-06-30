package r10;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr10/d;", "Landroid/os/Parcelable;", "R", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/feature/ecs/open/EcsOpenAsyncInfo$EcsAsyncRequest;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public abstract class d<R extends android.os.Parcelable> implements com.tencent.mm.ipcinvoker.j {
    public abstract android.os.Parcelable a();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Parcelable a17 = a();
        if (rVar != null) {
            rVar.a(a17);
        }
    }
}
