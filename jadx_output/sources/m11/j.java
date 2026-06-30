package m11;

/* loaded from: classes12.dex */
public class j implements com.tencent.mm.modelbase.u0, com.tencent.mm.modelbase.v0, k70.x {

    /* renamed from: f, reason: collision with root package name */
    public m11.h f322716f = null;

    /* renamed from: g, reason: collision with root package name */
    public m11.t0 f322717g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322718h = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f322714d = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f322715e = new java.util.HashSet();

    public j() {
        gm0.j1.n().f273288b.a(109, this);
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        m11.h hVar;
        java.util.Iterator it;
        m11.j jVar = this;
        if (jVar.f322717g != m1Var || (hVar = jVar.f322716f) == null || hVar.f322705f == null) {
            return;
        }
        java.util.Iterator it6 = new java.util.ArrayList(jVar.f322716f.f322705f).iterator();
        while (it6.hasNext()) {
            m11.i iVar = (m11.i) it6.next();
            k70.w wVar = iVar.f322708a;
            if (wVar != null) {
                m11.h hVar2 = jVar.f322716f;
                it = it6;
                wVar.o(hVar2.f322700a, hVar2.f322701b, hVar2.f322702c, hVar2.f322703d, hVar2.f322704e, iVar.f322709b, (int) j17, (int) j18, m1Var);
            } else {
                it = it6;
            }
            jVar = this;
            it6 = it;
        }
    }

    public final void a(m11.h hVar) {
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("ModelImage.DownloadImgService", "task is null");
            return;
        }
        java.util.List<m11.i> list = hVar.f322705f;
        if (list == null) {
            com.tencent.mars.xlog.Log.e("ModelImage.DownloadImgService", "task callback list is null");
            return;
        }
        for (m11.i iVar : list) {
            k70.w wVar = iVar.f322708a;
            if (wVar != null) {
                wVar.l(hVar.f322700a, hVar.f322701b, hVar.f322702c, hVar.f322703d, hVar.f322704e, iVar.f322709b);
            }
        }
    }

    public int b(long j17, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17, java.lang.Object obj, int i18, k70.w wVar, int i19, boolean z17) {
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e("ModelImage.DownloadImgService", "listener is null");
            return -1;
        }
        m11.h hVar = new m11.h(j17, msgIdTalker.f149480d, msgIdTalker.a(), i17);
        hVar.f322704e = i18;
        if (this.f322715e.contains(hVar)) {
            com.tencent.mars.xlog.Log.e("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] add failed, task already done");
            return -2;
        }
        m11.h hVar2 = this.f322716f;
        if (hVar2 != null && hVar.equals(hVar2)) {
            return this.f322716f.a(wVar, obj) ? 0 : -3;
        }
        java.util.List list = this.f322714d;
        int indexOf = list.indexOf(hVar);
        if (-1 < indexOf && indexOf < list.size()) {
            return ((m11.h) list.get(indexOf)).a(wVar, obj) ? 0 : -4;
        }
        com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] no found task, create a new task(" + j17 + " " + msgIdTalker.f149480d + " " + msgIdTalker.a() + " " + i17 + ") mLockStart: %s callbackDuration %s", java.lang.Boolean.valueOf(this.f322718h), java.lang.Integer.valueOf(i19));
        hVar.a(wVar, obj);
        if (!z17 || list.size() <= 0) {
            list.add(hVar);
        } else {
            list.add(0, hVar);
        }
        i(i19);
        return 0;
    }

    public boolean c(long j17, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17, java.lang.Object obj, int i18, k70.w wVar) {
        return b(j17, msgIdTalker, i17, obj, i18, wVar, -1, false) >= 0;
    }

    public void d(k70.w wVar) {
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e("ModelImage.DownloadImgService", "listener is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] cancel all tasks of listener");
        this.f322718h = true;
        if (this.f322716f != null) {
            com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "cancelAllTaskByListener CurTaskInfo %s mTodoList %s mLockStart %s", this.f322716f.f322700a + ", " + this.f322716f.f322701b + ", " + this.f322716f.f322703d, java.lang.Integer.valueOf(this.f322714d.size()), java.lang.Boolean.valueOf(this.f322718h));
            f(this.f322716f);
        }
        java.util.LinkedList<m11.h> linkedList = new java.util.LinkedList();
        synchronized (this.f322714d) {
            linkedList.addAll(this.f322714d);
        }
        for (m11.h hVar : linkedList) {
            if (hVar != null) {
                m11.i iVar = new m11.i(wVar, null);
                if (hVar.f322705f.contains(iVar)) {
                    hVar.f322705f.remove(iVar);
                }
                if (hVar.f322705f.size() <= 0) {
                    f(hVar);
                }
            }
        }
        this.f322718h = false;
        i(-1);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(wVar.hashCode());
        objArr[1] = this.f322716f == null ? "mCurTaskInfo is null" : this.f322716f.f322700a + ", " + this.f322716f.f322701b + ", " + this.f322716f.f322703d;
        com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "[ %s ] cancelAllTaskByListener done mCurTaskInfo %s", objArr);
    }

    public boolean e(long j17, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17) {
        return f(new m11.h(j17, msgIdTalker.f149480d, msgIdTalker.a(), i17));
    }

    public final boolean f(m11.h hVar) {
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("ModelImage.DownloadImgService", "task is null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel scene, (");
        sb6.append(hVar.f322700a);
        sb6.append(", ");
        long j17 = hVar.f322701b;
        sb6.append(j17);
        sb6.append(", ");
        int i17 = hVar.f322703d;
        sb6.append(i17);
        sb6.append(")");
        com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", sb6.toString());
        m11.h hVar2 = this.f322716f;
        if (hVar2 == null || !hVar2.equals(hVar)) {
            java.util.List list = this.f322714d;
            if (!list.contains(hVar)) {
                return false;
            }
            if (list.remove(hVar)) {
                a(hVar);
            }
            return true;
        }
        gm0.j1.n().f273288b.d(this.f322717g);
        this.f322717g = null;
        com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)", java.lang.Long.valueOf(hVar.f322700a), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        a(this.f322716f);
        this.f322716f = null;
        i(-1);
        return true;
    }

    public boolean g(long j17, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17, k70.w wVar) {
        m11.h hVar;
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e("ModelImage.DownloadImgService", "listener is null");
            return false;
        }
        m11.h hVar2 = new m11.h(j17, msgIdTalker.f149480d, msgIdTalker.a(), i17);
        m11.h hVar3 = this.f322716f;
        if (hVar3 == null || !hVar3.equals(hVar2)) {
            java.util.List list = this.f322714d;
            int indexOf = list.indexOf(hVar2);
            hVar = -1 != indexOf ? (m11.h) list.get(indexOf) : null;
        } else {
            hVar = this.f322716f;
        }
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] task no found, (" + j17 + ", " + msgIdTalker + ", " + i17 + ")");
            return false;
        }
        m11.i iVar = new m11.i(wVar, null);
        if (hVar.f322705f.contains(iVar)) {
            hVar.f322705f.remove(iVar);
        }
        if (hVar.f322705f.size() <= 0) {
            f(hVar);
        }
        com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] task has been canceled, (" + j17 + ", " + msgIdTalker + ", " + i17 + ")");
        return true;
    }

    public boolean h(long j17, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, int i17) {
        m11.h hVar = new m11.h(j17, msgIdTalker.f149480d, msgIdTalker.a(), i17);
        m11.h hVar2 = this.f322716f;
        return (hVar2 != null && hVar2.equals(hVar)) || this.f322714d.indexOf(hVar) >= 0;
    }

    public final void i(int i17) {
        java.lang.String str;
        synchronized (this.f322714d) {
            if (this.f322716f == null && this.f322714d.size() > 0 && true != this.f322718h) {
                m11.h hVar = (m11.h) this.f322714d.remove(0);
                this.f322716f = hVar;
                if (hVar == null) {
                    com.tencent.mars.xlog.Log.w("ModelImage.DownloadImgService", "null == mCurTaskInfo");
                    return;
                }
                m11.h hVar2 = this.f322716f;
                this.f322717g = new m11.t0(hVar2.f322700a, hVar2.f322701b, hVar2.f322702c, hVar2.f322703d, this, i17);
                int i18 = this.f322716f.f322704e;
                com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "do scene, (" + this.f322716f.f322700a + ", " + this.f322716f.f322701b + ", " + this.f322716f.f322703d + ")");
                gm0.j1.n().f273288b.g(this.f322717g);
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (this.f322716f == null) {
                str = "mCurTaskInfo is null";
            } else {
                str = this.f322716f.f322700a + ", " + this.f322716f.f322701b + ", " + this.f322716f.f322703d;
            }
            objArr[0] = str;
            objArr[1] = java.lang.Integer.valueOf(this.f322714d.size());
            objArr[2] = java.lang.Boolean.valueOf(this.f322718h);
            com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "mCurTaskInfo %s mTodoList %s mLockStart %s", objArr);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m11.h hVar;
        java.util.Iterator it;
        java.util.HashSet hashSet;
        if (this.f322717g != m1Var || (hVar = this.f322716f) == null || hVar.f322705f == null) {
            return;
        }
        java.util.HashSet hashSet2 = this.f322715e;
        hashSet2.add(new m11.h(hVar.f322700a, hVar.f322701b, hVar.f322702c, hVar.f322703d));
        com.tencent.mars.xlog.Log.i("ModelImage.DownloadImgService", "scene end, (" + this.f322716f.f322700a + ", " + this.f322716f.f322701b + ", " + this.f322716f.f322703d + ")");
        java.util.Iterator it6 = new java.util.ArrayList(this.f322716f.f322705f).iterator();
        while (it6.hasNext()) {
            m11.i iVar = (m11.i) it6.next();
            k70.w wVar = iVar.f322708a;
            if (wVar != null) {
                m11.h hVar2 = this.f322716f;
                it = it6;
                hashSet = hashSet2;
                wVar.f(hVar2.f322700a, hVar2.f322701b, hVar2.f322702c, hVar2.f322703d, hVar2.f322704e, iVar.f322709b, i17, i18, str, m1Var);
            } else {
                it = it6;
                hashSet = hashSet2;
            }
            hashSet2 = hashSet;
            it6 = it;
        }
        hashSet2.remove(this.f322716f);
        this.f322716f = null;
        this.f322717g = null;
        i(-1);
    }
}
