package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gt implements android.view.View.OnDragListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ht f168463d;

    public gt(com.tencent.mm.plugin.sns.ui.ht htVar) {
        this.f168463d = htVar;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        com.tencent.mm.plugin.sns.ui.ht htVar;
        java.lang.String str;
        java.lang.String str2;
        char c17;
        java.lang.String string;
        char c18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(dragEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUIAction$14$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", this, array);
        int action = dragEvent.getAction();
        boolean z17 = true;
        if (action != 1 && action != 2) {
            char c19 = 3;
            int i17 = 0;
            if (action == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "ACTION_DROP");
                android.content.ClipData clipData = dragEvent.getClipData();
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                    int i18 = 0;
                    while (true) {
                        htVar = this.f168463d;
                        if (i18 >= itemCount) {
                            break;
                        }
                        android.content.ClipData.Item itemAt = clipData.getItemAt(i18);
                        if (itemAt == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsActivity", "item == null");
                        } else if (itemAt.getIntent() != null) {
                            android.app.Activity a17 = com.tencent.mm.plugin.sns.ui.SnsUIAction.a(htVar.f168533d);
                            android.content.Intent intent = itemAt.getIntent();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(intent);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUIAction$14$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            a17.startActivity((android.content.Intent) arrayList3.get(i17));
                            yj0.a.f(a17, "com/tencent/mm/plugin/sns/ui/SnsUIAction$14$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (itemAt.getUri() != null) {
                            android.app.Activity a18 = com.tencent.mm.plugin.sns.ui.SnsUIAction.a(htVar.f168533d);
                            android.net.Uri uri = itemAt.getUri();
                            if (uri == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "initFileTypeAndPath uri == null");
                            } else if (a18 == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "initFileTypeAndPath context == null");
                            } else {
                                android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
                                java.lang.String type = a18.getContentResolver().getType(uri);
                                if (type != null && type.length() > 0) {
                                    android.database.Cursor query = a18.getContentResolver().query(uri, null, null, null, null);
                                    if (query == null) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor is null");
                                    } else if (query.getCount() <= 0 || !query.moveToFirst()) {
                                        query.close();
                                        com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
                                    } else {
                                        int columnIndex = query.getColumnIndex("_data");
                                        if (columnIndex == -1) {
                                            query.close();
                                            com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
                                        } else {
                                            string = query.getString(columnIndex);
                                            query.close();
                                            str = string;
                                        }
                                    }
                                    string = null;
                                    str = string;
                                } else if (uri.getPath() != null) {
                                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(uri.getPath());
                                    if (r6Var.m()) {
                                        str = r6Var.o();
                                        int lastIndexOf = str.lastIndexOf(".");
                                        if (lastIndexOf != -1 && lastIndexOf < str.length() - 1) {
                                            type = singleton.getMimeTypeFromExtension(str.substring(lastIndexOf + 1));
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.UriFileHelper", "File is null");
                                    }
                                } else {
                                    str = null;
                                }
                                if (type == null || str == null) {
                                    str2 = str;
                                    c17 = 0;
                                } else {
                                    c17 = type.contains("image") ? (char) 3 : type.contains("video") ? (char) 4 : type.contains("audio") ? (char) 5 : type.contains("mm_item") ? (char) 2 : (char) 1;
                                    uri.toString();
                                    str2 = str;
                                }
                                if (c17 != 0 || str2 == null) {
                                    c18 = 3;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsActivity", "get file path failed");
                                } else {
                                    c18 = 3;
                                    if (c17 == 3) {
                                        arrayList2.add(str2);
                                    }
                                }
                                i18++;
                                c19 = c18;
                                i17 = 0;
                            }
                            c17 = 0;
                            str2 = null;
                            if (c17 != 0) {
                            }
                            c18 = 3;
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsActivity", "get file path failed");
                            i18++;
                            c19 = c18;
                            i17 = 0;
                        }
                        c18 = c19;
                        i18++;
                        c19 = c18;
                        i17 = 0;
                    }
                    if (arrayList2.size() < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsActivity", "no image file available");
                        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$14$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14$1");
                        return true;
                    }
                    android.content.Intent intent2 = new android.content.Intent(com.tencent.mm.plugin.sns.ui.SnsUIAction.a(htVar.f168533d), (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsUploadUI.class);
                    intent2.putExtra("KSnsPostManu", true);
                    intent2.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
                    intent2.putStringArrayListExtra("sns_kemdia_path_list", arrayList2);
                    intent2.setAction("android.intent.action.SEND");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.intent.extra.TEXT", "");
                    intent2.putExtra("Ksnsupload_empty_img", true);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = htVar.f168533d;
                    boolean z18 = snsUIAction.P;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                    if (z18) {
                        intent2.putExtra("Ksnsupload_source", 11);
                    }
                    intent2.setType("image/*");
                    android.app.Activity a19 = com.tencent.mm.plugin.sns.ui.SnsUIAction.a(snsUIAction);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent2);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(a19, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsUIAction$14$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    a19.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(a19, "com/tencent/mm/plugin/sns/ui/SnsUIAction$14$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (action != 4 && action != 5) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsActivity", "Unknown action type received by OnDragListener.");
                z17 = false;
            }
            yj0.a.i(z17, this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$14$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14$1");
            return z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsActivity", "ACTION: [%s]", java.lang.Integer.valueOf(action));
        yj0.a.i(z17, this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$14$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$14$1");
        return z17;
    }
}
