package wu3;

/* loaded from: classes5.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f449768b;

    public j(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView, boolean z17) {
        this.f449767a = editorAudioSearchView;
        this.f449768b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView = this.f449767a;
        com.tencent.mars.xlog.Log.i(editorAudioSearchView.f155950d, "LogStory: SearchdMusic callback " + i17 + ' ' + i18 + ", " + str);
        if (i17 == 0 && i18 == 0) {
            r45.mh mhVar = (r45.mh) fVar.f70618d;
            editorAudioSearchView.f155965v = mhVar.f380499d;
            editorAudioSearchView.f155966w++;
            java.util.LinkedList linkedList = mhVar.f380500e;
            kotlin.jvm.internal.o.d(linkedList);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = 0;
            for (java.lang.Object obj3 : linkedList) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo c17 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.c((r45.mh4) obj3, 3);
                c17.f155719p = 4;
                c17.f155726w = 0;
                c17.f155727x = editorAudioSearchView.mRelatedRecId;
                arrayList.add(c17);
                i19 = i27;
            }
            if (linkedList.size() == 10) {
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
                audioCacheInfo.f155718o = 5;
                arrayList.add(audioCacheInfo);
            }
            if (linkedList.isEmpty() && editorAudioSearchView.f155966w == 1) {
                android.widget.LinearLayout linearLayout = editorAudioSearchView.f155961r;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = editorAudioSearchView.f155959p;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                android.widget.TextView textView = editorAudioSearchView.f155960q;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                android.widget.LinearLayout linearLayout2 = editorAudioSearchView.f155961r;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                androidx.recyclerview.widget.RecyclerView recyclerView2 = editorAudioSearchView.f155959p;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
                android.widget.TextView textView2 = editorAudioSearchView.f155960q;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                if (this.f449768b) {
                    su3.m mVar = editorAudioSearchView.f155964u;
                    if (mVar != null) {
                        java.util.ArrayList arrayList2 = mVar.f412793d;
                        int size = arrayList2.size();
                        java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = listIterator.previous();
                            int i28 = ((com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj2).f155718o;
                            if (i28 == 4 || i28 == 5 || i28 == 2) {
                                break;
                            }
                        }
                        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj2;
                        if (audioCacheInfo2 != null) {
                            arrayList2.remove(audioCacheInfo2);
                        }
                        int size2 = arrayList2.size();
                        if (size == size2) {
                            arrayList2.addAll(arrayList);
                            mVar.notifyItemRangeInserted(size, arrayList.size());
                        } else {
                            arrayList2.addAll(arrayList);
                            mVar.notifyItemChanged(size2);
                            mVar.notifyItemRangeInserted(size, arrayList.size() - 1);
                        }
                    }
                } else {
                    su3.m mVar2 = editorAudioSearchView.f155964u;
                    if (mVar2 != null) {
                        mVar2.B(arrayList);
                    }
                }
            }
            com.tencent.mm.autogen.mmdata.rpt.VideoBGMSearchStruct videoBGMSearchStruct = wt3.v.f449506j;
            videoBGMSearchStruct.f61555h = editorAudioSearchView.f155965v;
            videoBGMSearchStruct.f61551d = videoBGMSearchStruct.b("QueryContent", editorAudioSearchView.f155968y, true);
            com.tencent.mars.xlog.Log.i(editorAudioSearchView.f155950d, "get audio list " + mhVar);
        } else if (editorAudioSearchView.f155966w == 0) {
            android.widget.LinearLayout linearLayout3 = editorAudioSearchView.f155961r;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = editorAudioSearchView.f155959p;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(8);
            }
            android.widget.TextView textView3 = editorAudioSearchView.f155960q;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        return null;
    }
}
