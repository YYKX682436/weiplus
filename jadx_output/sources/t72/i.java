package t72;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f416064d;

    /* renamed from: e, reason: collision with root package name */
    public int f416065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f416066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f416067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t72.l f416068h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, int i17, t72.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416066f = j17;
        this.f416067g = i17;
        this.f416068h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new t72.i(this.f416066f, this.f416067g, this.f416068h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((t72.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f416065e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fav_tags_prefix_");
            long j17 = this.f416066f;
            sb6.append(j17);
            java.lang.String sb7 = sb6.toString();
            java.util.Set<java.lang.String> stringSet = t72.l.f416072g.getStringSet(sb7, new java.util.HashSet());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[restartBindTagTask] localId = ");
            sb8.append(j17);
            sb8.append(", favId = ");
            int i18 = this.f416067g;
            sb8.append(i18);
            sb8.append(", tags = ");
            sb8.append(stringSet);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTagsManager", sb8.toString());
            kotlin.jvm.internal.o.d(stringSet);
            if (stringSet.size() == 0) {
                return f0Var;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.String str2 : stringSet) {
                t72.b bVar = t72.b.f416040a;
                kotlin.jvm.internal.o.d(str2);
                t72.a f17 = bVar.f(str2);
                int i19 = f17 != null ? f17.field_id : 0;
                r45.hi hiVar = new r45.hi();
                hiVar.f376177e = i19;
                hiVar.f376178f = str2;
                hiVar.f376176d = i18;
                hiVar.f376179g = 1;
                linkedList.add(hiVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagsManager", "[restartBindTagTask] tag = " + str2 + ", fav id = " + i18 + ", tag id = " + i19);
            }
            this.f416064d = sb7;
            this.f416065e = 1;
            java.lang.Object T6 = this.f416068h.T6(linkedList, this);
            if (T6 == aVar) {
                return aVar;
            }
            str = sb7;
            obj = T6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f416064d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            t72.l.f416072g.remove(str);
        }
        return f0Var;
    }
}
