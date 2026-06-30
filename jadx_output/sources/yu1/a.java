package yu1;

/* loaded from: classes13.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu1.c f465842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yu1.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465842d = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yu1.a(this.f465842d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yu1.a aVar = (yu1.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yu1.c cVar = this.f465842d;
        java.io.BufferedReader bufferedReader = cVar.f465846c;
        if (bufferedReader == null) {
            kotlin.jvm.internal.o.o("reader");
            throw null;
        }
        while (cVar.f465845b) {
            try {
                if (bufferedReader.ready()) {
                    java.lang.String readLine = bufferedReader.readLine();
                    java.util.Iterator it = ((java.util.ArrayList) cVar.f465844a).iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.f.a(it.next());
                        kotlin.jvm.internal.o.d(readLine);
                        throw null;
                        break;
                    }
                } else {
                    continue;
                }
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.e("reader", "No elements come", e17);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("reader", "Unknown error", e18);
            }
        }
        return jz5.f0.f302826a;
    }
}
