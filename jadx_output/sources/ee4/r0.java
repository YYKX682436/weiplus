package ee4;

/* loaded from: classes4.dex */
public final class r0 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public ge4.e f251738n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f251739o;

    /* renamed from: p, reason: collision with root package name */
    public kotlin.coroutines.Continuation f251740p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    public static final void p(ee4.r0 r0Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resumeWaitWorkFinishContinuation", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        r0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeWaitWorkFinishContinuation", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        kotlinx.coroutines.l.d(r0Var.o().q(), null, null, new ee4.q0(r0Var, z17, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeWaitWorkFinishContinuation", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resumeWaitWorkFinishContinuation", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        return "SnsPublish.MultiPicLivePhotoWorkPc";
    }

    @Override // ce4.a
    public boolean h(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        if (!super.h(bundle)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            return false;
        }
        ge4.e eVar = new ge4.e();
        this.f251738n = eVar;
        ee4.p0 p0Var = new ee4.p0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDeleteItemFileFun", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        eVar.f270997j = p0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDeleteItemFileFun", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCollectEventJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        this.f251739o = kotlinx.coroutines.l.d(o().p(), null, null, new ee4.o0(this, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCollectEventJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        return true;
    }

    @Override // ce4.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        super.i();
        ge4.e eVar = this.f251738n;
        if (eVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            java.util.LinkedList<ge4.a> linkedList = eVar.f270989b;
            int size = linkedList.size();
            java.util.LinkedList linkedList2 = eVar.f270988a;
            com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", eVar.hashCode() + " release >> runningSize: " + size + " waitSize: " + linkedList2.size());
            eVar.f270996i = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(eVar.hashCode());
            sb6.append(" release ");
            sb6.append(eVar.f270996i);
            com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", sb6.toString());
            linkedList2.clear();
            for (ge4.a aVar : linkedList) {
                com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "cancel job mediaId: " + aVar.b().g());
                aVar.a();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        }
        this.f251738n = null;
        kotlinx.coroutines.r2 r2Var = this.f251739o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f251739o = null;
        this.f251740p = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
    }

    public final void q(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        kotlin.jvm.internal.o.g(item, "item");
        if (item.d() == 6) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addPublishItem is LivePhoto to add Job >> ");
            com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem) item;
            sb6.append(snsPublishLivePhotoItem.g());
            f(sb6.toString());
            ge4.e eVar = this.f251738n;
            if (eVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                java.lang.String h17 = snsPublishLivePhotoItem.h();
                java.util.HashMap hashMap = eVar.f270994g;
                if (hashMap.containsKey(h17)) {
                    com.tencent.mars.xlog.Log.e("SnsPublish.SnsPublishLivePhotoWorkMgr", "addJob >> is in map return");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                } else {
                    java.util.LinkedList linkedList = eVar.f270989b;
                    int size = linkedList.size();
                    com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "addJob >> mediaId: " + snsPublishLivePhotoItem.g() + " runningJobSize: " + size + ' ');
                    he4.e eVar2 = new he4.e();
                    eVar2.f(new he4.f());
                    eVar2.f(new he4.h());
                    ge4.a aVar = new ge4.a(eVar2, snsPublishLivePhotoItem);
                    java.lang.String h18 = snsPublishLivePhotoItem.h();
                    kotlin.jvm.internal.o.d(h18);
                    hashMap.put(h18, aVar);
                    if (size >= 1) {
                        com.tencent.mars.xlog.Log.w("SnsPublish.SnsPublishLivePhotoWorkMgr", "the running job size is matching max");
                        eVar.f270988a.addLast(aVar);
                    } else {
                        linkedList.addLast(aVar);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launchJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                        kotlinx.coroutines.l.d(eVar.f270995h, null, null, new ge4.d(aVar, eVar, null), 3, null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launchJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
    }

    public final void r(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removePublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        kotlin.jvm.internal.o.g(item, "item");
        if (item.d() == 6) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addPublishItem is LivePhoto to add Job >> ");
            com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem) item;
            sb6.append(snsPublishLivePhotoItem.g());
            f(sb6.toString());
            ge4.e eVar = this.f251738n;
            if (eVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "removeJob >> " + snsPublishLivePhotoItem.g() + " mediaKey: " + snsPublishLivePhotoItem.h());
                java.util.HashMap hashMap = eVar.f270994g;
                java.lang.String h17 = snsPublishLivePhotoItem.h();
                kotlin.jvm.internal.o.d(h17);
                ge4.a aVar = (ge4.a) hashMap.get(h17);
                if (aVar == null) {
                    com.tencent.mars.xlog.Log.e("SnsPublish.SnsPublishLivePhotoWorkMgr", "job no find in map");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                } else {
                    com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "removeJob >> job " + aVar.b().h() + " go to cancel");
                    java.util.LinkedList linkedList = eVar.f270988a;
                    boolean contains = linkedList.contains(aVar);
                    java.util.LinkedList linkedList2 = eVar.f270991d;
                    if (contains) {
                        com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "job is in wait go to remove");
                        linkedList.remove(aVar);
                        linkedList2.addLast(aVar);
                    } else if (eVar.f270989b.contains(aVar)) {
                        com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "job is in running go to remove");
                        aVar.a();
                    } else {
                        java.util.LinkedList linkedList3 = eVar.f270992e;
                        if (linkedList3.contains(aVar)) {
                            com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "error queue is contain job: " + aVar.b().h());
                            linkedList3.remove(aVar);
                            linkedList2.addLast(aVar);
                            yz5.l lVar = eVar.f270997j;
                            if (lVar != null) {
                                lVar.invoke(snsPublishLivePhotoItem);
                            }
                        } else {
                            java.util.LinkedList linkedList4 = eVar.f270993f;
                            if (linkedList4.contains(aVar)) {
                                com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "originErr queue is contain job: " + aVar.b().h());
                                linkedList4.remove(aVar);
                                linkedList2.addLast(aVar);
                                yz5.l lVar2 = eVar.f270997j;
                                if (lVar2 != null) {
                                    lVar2.invoke(snsPublishLivePhotoItem);
                                }
                            } else if (eVar.f270990c.contains(aVar)) {
                                com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "finish queue is contain job: " + aVar.b().h());
                                linkedList2.addLast(aVar);
                                yz5.l lVar3 = eVar.f270997j;
                                if (lVar3 != null) {
                                    lVar3.invoke(snsPublishLivePhotoItem);
                                }
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removePublishItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
    }
}
